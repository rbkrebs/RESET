package br.com.cwi.tinderevolution.domain;

import javax.validation.constraints.NotNull;


public class Sport {

    private int id;

    @NotNull(message = "o campo nome é obrigatório")
    private String nome;

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

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
