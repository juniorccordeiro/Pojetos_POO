
package bancobrasil;

import java.util.Date;


public class Cliente extends Usuario{
     private Date dataRegistro = new Date();
     
     
     

     public Cliente(){}
     
    public Cliente(String nome, String sobrenome, String telefone) {
        this.setNome(nome);
        this.setSobremnome(sobrenome);
        this.setTelefone(telefone);
    }
   
   public void setdataregistro(Date dataregistro){
       this.dataRegistro = dataregistro;
   }
    
    public Date getdataregistro(){
       return this.dataRegistro;
   }
    
    @Override
    public String imprimirInfo(){
        return String.format("Nome: %s\n Sobrenome: %s\n, Telefone: %s, Data Registro: %s\n",
        this.getNome(), this.getSobremnome(), this.getTelefone(), this.dataRegistro);
    }
}
