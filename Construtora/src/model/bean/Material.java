package model.bean;

public class Material {
    private int Id;
    private String Nome;
    private String Fornecedor;
    private int Estoque;
    private double Preco;

    @Override
    public String toString() {
        return "Material{" + "Id=" + Id + ", Nome=" + Nome + ", Fornecedor=" + Fornecedor + ", Estoque=" + Estoque + ", Preco=" + Preco + "\n" + '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
}
