
package bancobrasil;

public class ContaBancaria {

    //Atributos da classe
    String agencia;
    String conta;
    double Saldo;
    String proprietario;
    //Métodos(comportamentos) da classe.
    
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

    void transferir() {
    }

    String consultarSaldo() {//Método sem parametro.
        //Strin.format() método da classe String para utilizar formatação
        //com identificadores(%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.Saldo);

    }
}
