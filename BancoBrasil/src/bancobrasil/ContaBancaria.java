
package bancobrasil;

public class ContaBancaria {

    //Atributos da classe
    private String agencia;
    private String conta;
    private double Saldo;
    private Usuario proprietario;
    //Métodos(comportamentos) da classe.
    
    ContaBancaria(){
        
    }
    
    ContaBancaria(String agen, String cont, double Sald, Usuario propri){
        
    }
    
    String getAgencia(){
        return this.agencia;
    }
    
    void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    String getConta(){
        return this.conta;
    }
    
    void setConta(String conta){
        this.conta = this.conta;
    }
    
    double getSaldo(){
        return this.Saldo;
    }
    
    void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    
    Usuario getProprietario(){
        return this.proprietario;
        
    }
    
    void setProprietario(Usuario Proprietario){
        this.proprietario = Proprietario;
    }
   
    void depositar(double valor) {
        this.Saldo = this.Saldo + valor;
    }

    void sacar(double valor) {
        if(this.Saldo>= valor){
             this.Saldo = this.Saldo - valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
       
    }

    void transferir(ContaBancaria contabancaria, double valor) {//metodo com parametro
        
        if(valor<Saldo){
            this.sacar(valor);
           contabancaria.Saldo += valor;  
        }else{
            System.out.println("Saldo Insuficiente");
        }
       
    }

    String consultarSaldo() {//Método sem parametro.
        //Strin.format() método da classe String para utilizar formatação
        //com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.Saldo);

    }
}
