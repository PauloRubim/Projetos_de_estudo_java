
package testeabstrata;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private Sexo sexo;
    
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", salario=" + salario + ", sexo=" + sexo.getDescricao() + '}';
    }
    
    
}
