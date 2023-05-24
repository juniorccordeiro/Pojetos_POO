
package bancobrasil;

import java.util.Date;


public class Usuario {
   private String nome;
   private String sobrenome;
   private String telefone;
  
   
   Usuario(){
       
   }
   
   Usuario(String nom, String sob, String tel){
       this.nome = nom;
       this.sobrenome = sob;
       this.telefone = tel;
   }
   
   public String getnome(){
       return this.nome;
   }
   
   public void setnome(String nome){
       this.nome = nome;
   }
   
   public String getsobrenome(){
       return this.sobrenome;
   }
   
   public void setsobrenome(String sobrenome){
       this.sobrenome = sobrenome;
   }
   
   public String gettelefone(){
       return this.telefone;
   }
   
   public void settelefone(String telefone){
       this.telefone = telefone;
   }
   
   
   
   public String imprimirInfo(){
       return String.format("Nome: %s\n Sobrenome: %s\n, Telefone: %s, Data Registro: %s",
       this.nome, this.sobrenome, this.telefone);
   }
}
