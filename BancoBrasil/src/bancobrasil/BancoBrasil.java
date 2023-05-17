
package bancobrasil;

import java.util.Scanner;

/**
 *
 * @author programador
 */
public class BancoBrasil {
//Instanciando um objeto do tipo ContaBancaria e referenciando nas
    //variaveis contaBancaria1 e ContaBancaria2
    public static void main(String[] args) {
     ContaBancaria contaBancaria1 =  new ContaBancaria();
      ContaBancaria contaBancaria2 = new ContaBancaria();
      
      //Atribuindo valores ao nosso objeto
      contaBancaria1.agencia = "0001";
      contaBancaria1.conta = "12345";
      contaBancaria1.proprietario = "Junior";
      contaBancaria1.Saldo = 1.99; 
      
      System.out.println(contaBancaria1.agencia);
      System.out.println(contaBancaria1.Saldo);
      System.out.println(contaBancaria1.conta);
      System.out.println(contaBancaria1.proprietario);
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("BEM-VINDO AO BANCO BRASIL");
      System.out.println("CADASTRO DE CONTAS");
      System.out.println("Digite a agência ->");
      contaBancaria1.agencia = scan.next();
      System.out.print("nDigite a conta ->");
      contaBancaria1.conta = scan.next();
      System.out.print("Digite o proprietario ->");
      contaBancaria1.proprietario = scan.next();
      System.out.println("Digite o saldo incial ->");
      contaBancaria1.Saldo = scan.nextDouble();
    }
    
}
