package model.bean;

public class Construcao_Material {
    private int Id;
    private int Id_Construcao;
    private int Id_Material;

    @Override
    public String toString() {
        return "Conexao_Material{" + "Id=" + Id + ", Id_Construcao=" + Id_Construcao + ", Id_Material=" + Id_Material +"\n"+ '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_Construcao() {
        return Id_Construcao;
    }

    public void setId_Construcao(int Id_Construcao) {
        this.Id_Construcao = Id_Construcao;
    }

    public int getId_Material() {
        return Id_Material;
    }

    public void setId_Material(int Id_Material) {
        this.Id_Material = Id_Material;
    }
}
