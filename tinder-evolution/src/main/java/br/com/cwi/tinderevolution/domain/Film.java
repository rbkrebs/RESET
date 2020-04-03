package br.com.cwi.tinderevolution.domain;


import br.com.cwi.tinderevolution.domain.enums.Category;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Film {

    private int id;

    @NotNull(message = "o campo nome é obrigatório")
    private String nome;
    @NotNull(message = "o campo diretor é obrigatório")
    private String diretor;
    @NotNull(message = "o campo data de lançamento é obrigatório")
    private LocalDate dataDeLancamento;
    @NotNull(message = "o campo categoria é obrigatório")
    private Category category;
    @NotNull(message = "o campo sinopse é obrigatório")
    private String sinopse;

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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", categoria=" + category +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
