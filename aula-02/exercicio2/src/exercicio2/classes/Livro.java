package exercicio2.classes;

import exercicio2.enums.Categoria;
import exercicio2.enums.Status;

public class Livro {

    private String nome;
    private Autor autor;
    private Categoria categoria;
    private Status status;

    public Livro(String nome, Autor autor, Categoria categoria, Status status) {
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
        this.status = status;
    }


    @Override
    public String toString() {
        return this.categoria+" - "+this.nome+"( "+this.autor+" ):"+this.status+"";
    }
}
