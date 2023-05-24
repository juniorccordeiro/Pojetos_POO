
package bancobrasil;

import java.util.Date;


public class Cliente extends Usuario{
     private Date dataRegistro = new Date();
     
     
     

     public Cliente(){}
     
    public Cliente(String nom, String sob, String tel) {
        super(nom, sob, tel);
    }
   
   public void setdataregistro(Date dataregistro){
       this.dataRegistro = dataregistro;
   }
    
    public Date getdataregistro(){
       return this.dataRegistro;
   }
    
    @Override
    public String imprimirInfo(){
        return String.format("Nome: %s\n Sobrenome: %s\n, Telefone: %s, Data Registro: %s\nData de Registro: %s",
        super.getnome(), super.getsobrenome(), super.gettelefone(), this.dataRegistro);
    }
}
