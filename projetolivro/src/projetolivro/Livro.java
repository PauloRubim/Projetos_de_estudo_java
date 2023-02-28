/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor; 
    private int totpaginas; 
    private int pagatual; 
    private boolean aberto; 
    private Pessoa leitor; 

 
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totpaginas=" + totpaginas + ", pagatual=" + pagatual + ", aberto=" + aberto + ", leitor=" + leitor + '}';
    }

    public Livro(String titulo, String autor, int totpaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totpaginas = totpaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagatual = 0; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotpaginas() {
        return totpaginas;
    }

    public void setTotpaginas(int totpaginas) {
        this.totpaginas = totpaginas;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
    this.aberto = true;  
    }

    @Override
    public void fechar() {
    this.aberto = false;  

    }

    @Override
    public void folhear(int p) {
        if(p>this.totpaginas){
            System.out.println("impossivel");            
        }else{
        this.pagatual = p;

        }
    }

    @Override
    public void avancarpag() {
        this.pagatual++; 
    }

    @Override
    public void voltarpag() {
         this.pagatual--; 
    }
    
}
