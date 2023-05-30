
package bancobrasil;


public abstract class Usuario {
    
    private String nome;
    private String sobremnome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobremnome() {
        return sobremnome;
    }

    public void setSobremnome(String sobremnome) {
        this.sobremnome = sobremnome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public abstract String imprimirInfo();
     
    
}
