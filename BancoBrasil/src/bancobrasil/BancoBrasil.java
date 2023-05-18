
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
      Usuario user1 = new Usuario();
      Usuario user2 = new Usuario();
      
      //Atribuindo valores ao nosso objeto
//      contaBancaria1.agencia = "0001";
//      contaBancaria1.conta = "12345";
//      contaBancaria1.proprietario = "Junior";
//      contaBancaria1.Saldo = 1.99; 
      
//      System.out.println(contaBancaria1.agencia);
//      System.out.println(contaBancaria1.Saldo);
//      System.out.println(contaBancaria1.conta);
//      System.out.println(contaBancaria1.proprietario);
      
      Scanner scan = new Scanner(System.in);
      
      //Atribuindo valores ao objeto(utilizando intereção com o usuário)
      System.out.println("BEM-VINDO AO BANCO BRASIL");
      System.out.println("CADASTRO DE CONTAS");
      System.out.println("Digite a agência ->");
      contaBancaria1.agencia = scan.next();
      System.out.print("nDigite a conta ->");
      contaBancaria1.conta = scan.next();
      
      //Inserção de dados do usuário
      System.out.print("\nDados do Usuário ->");
       System.out.print("\nDigite o nome do cliente ->");
       user1.nome = scan.next();
       System.out.print("\nDigite o sobrenome do cliente ->");
       user1.sobrenome = scan.next();
       System.out.print("Digite o telefone do cliente ->");
       user1.telefone = scan.next();
       contaBancaria1.proprietario = user1;
      
      
      System.out.print("\n Digite o valor de deposito -> ");
            contaBancaria1.depositar(scan.nextDouble());
            
            System.out.println(contaBancaria1.agencia+"\n"
            +contaBancaria1.conta + "\n"
            +contaBancaria1.proprietario.imprimirInfo() + "n"
            +contaBancaria1.consultarSaldo());
      
            System.out.print("Digite o valor para saque ->");
            contaBancaria1.sacar(scan.nextDouble());
            
            System.out.println(contaBancaria1.consultarSaldo());
      
    }
    
}
