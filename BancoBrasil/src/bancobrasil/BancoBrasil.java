
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
        /*/
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
       user1.setnome(scan.next());
       System.out.print("\nDigite o sobrenome do cliente ->");
       user1.setsobrenome(scan.next());
       System.out.print("Digite o telefone do cliente ->");
       user1 settelefone (scan.next());
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
/*/
        
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        Usuario user;
        Usuario[] users = new Usuario [5];
        ContaBancaria contabancaria = new ContaBancaria();
        ContaBancaria[] contas = new ContaBancaria[5];
        
        while(opcao != 3){
        //1 Tela
        System.out.println("***Banco Brasil***");
        System.out.println("1- Cadastro de Cliente: ");
        System.out.println("2- Cadastro da Conta: ");
        System.out.println("3- Sair");
        System.out.println("Escolha uma Opção: ");
        opcao = scan.nextInt();
        
        
        switch(opcao){
            case 1:
                for(int i=0; i<5; i++){
                    user = new Usuario();
                    System.out.println("***Cadastro de Cliente***");
                    System.out.print("Nome: ");
                    user.setnome(scan.next());
                    System.out.print("Sobrenome: ");
                    user.setsobrenome(scan.next());
                    System.out.print("Telefone: ");
                    user.settelefone(scan.next());

                    users[i] = user;
                }
                
                break;
                
                case 2:
                    if(users[0] == null){
                        System.out.println("Cadastro de Clientes Vazio ");
                        break;
                    }
                    System.out.println("***Cadastro de Conta***");
                    System.out.print("Agencia: ");
                    contabancaria.setAgencia(scan.next());
                    System.out.print("Conta: ");
                    contabancaria.setConta(scan.next());
                    System.out.println("Clientes Cadastrados");
                    for(int i=0; i<5; i++){
                        System.out.printf("%d- %s %s\n", i+1, users[i].getnome(), users[i].getsobrenome());
                    }
                    System.out.println("Selecione o Cliente: ");
                    
                    //Realizar a implementação para associar um usuario selecionado com a conta
                    //que está sendo criada, e a validadeção caso nãoexista nenhum user no vetor.
                    int userOpcao = scan.nextInt();
                    if(userOpcao > users.length){
                        System.out.println("Seleção Inválida");
                        break;
                    }
                    int cliente = userOpcao-1;
                    contabancaria.setProprietario(users[cliente]);            
                           
                break;
                
                case 3:
                    System.out.println("***Até Breve***");
                
                break;
                default:
                    System.out.println("***Opção Inválida***");
        }
    
    }
}
    }
