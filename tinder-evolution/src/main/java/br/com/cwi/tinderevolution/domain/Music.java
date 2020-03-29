package br.com.cwi.tinderevolution.domain;

import java.time.LocalDate;

public class Music {

    private int id;
    private String nome;
    private String Autor;
    private LocalDate dataDeLancamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Autor='" + Autor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                '}';
    }
}
