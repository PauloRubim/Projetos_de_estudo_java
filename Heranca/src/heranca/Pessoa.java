package heranca;

public abstract class Pessoa { // Uma classe abstrata não pode ser instanciada, pois so serve pra herança,
    // ou seja, apenas para passar seus atributos e metodos para suas classes filhas. 
    protected String nome;
    protected int idade;
    protected String sexo;  
    
    public void fazerAnivarsario(){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
