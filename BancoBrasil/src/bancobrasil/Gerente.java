
package bancobrasil;


public class Gerente extends Usuario{
    private String login;
    private String password;
    
    public Gerente(){}

    public Gerente(String login, String password, String nom, String sob, String tel) {
        super(nom, sob, tel);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
   
    
    
    
    
}
