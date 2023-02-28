package projetoyoutube;

public class Gafanhoto extends Pessoa{
    private String login; 
    private int totalAssistido; 

    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo); //faz uma chamada ao construtor da classe pai. 
        this.login = login; 
        this.totalAssistido = 0; 
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    
}
