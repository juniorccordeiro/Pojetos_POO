package bancobrasil;

import java.util.ArrayList;
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
        int opcao = 0, qtdCadastro = 0;
        boolean isLogin = false;
        Usuario user;
        ArrayList<Usuario> users = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ContaBancaria contabancaria = new ContaBancaria();
        GerenteRepository db_gerente = new GerenteRepository();
        
        gerentes = db_gerente.addGerente();
        
        do{
        System.out.println("***SEJA BEM VINDO AO BANCO BRASIL***");
        System.out.printf("LOGIN: ");
        String login = scan.next();
        System.out.printf("PASSWORD: ");
        String password = scan.next();
        
        for(Gerente g : gerentes){
            if(g.getLogin().equals(login) && g.getPassword().equals(password)){
                isLogin = true;
            }
        }
            String notValidate = "", validate = "Usuário ou Senha Incorretos!";
            System.out.printf("%s\n", isLogin==true?"":"Usuário ou Senha Incorretos!" );
        }while(isLogin != true);
        
        

        while (opcao != 3) {
            //1 Tela
            System.out.println("***Banco Brasil***");
            System.out.println("1- Cadastro de Cliente: ");
            System.out.println("2- Cadastro da Conta: ");
            System.out.println("3- Sair");
            System.out.println("Escolha uma Opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("***Cadastro de Cliente***");
                    System.out.print("Quantidade de Cadastros");
                    qtdCadastro = scan.nextInt();
                    for (int i = 0; i < qtdCadastro; i++) {
                        user = new Cliente();

                        System.out.print("Nome: ");
                        user.setNome(scan.next());
                        System.out.print("Sobrenome: ");
                        user.setSobremnome(scan.next());
                        System.out.print("Telefone: ");
                        user.setTelefone(scan.next());

                        users.add(user);
                    }

                    break;

                case 2:
                    System.out.println("***Cadastro de Conta***");
                    System.out.print("Agencia: ");
                    contabancaria.setAgencia(scan.next());
                    System.out.print("Conta: ");
                    contabancaria.setConta(scan.next());
                    System.out.println("Clientes Cadastrados");

                    if (users.size() != 0) {
                        for (int i = 0; i < qtdCadastro; i++) {
                            System.out.printf("%d- %s %s\n", i + 1, users.get(i).getNome(), users.get(i).getSobremnome());
                        }
                        System.out.println("Selecione o Cliente: ");
                        int userOpcao = scan.nextInt();
                        contabancaria.setProprietario(users.get(userOpcao - 1));   
                    }else{
                        System.out.println("Nenhum cliente cadastrado!");
                    }
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
