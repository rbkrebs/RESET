package br.com.cwi.tinderevolution.domain;

import br.com.cwi.tinderevolution.domain.enums.Platform;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Game{

    private int id;

    @NotNull(message = "o campo nome é obrigatório")
    private String nome;
    @NotNull(message = "o campo publisher é obrigatório")
    private String publisher;
    @NotNull(message = "o campo data de lançamento é obrigatório")
    private LocalDate dataDeLancamento;
    @NotNull(message = "o campo categoria é obrigatório")
    private Platform categoria;

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public Platform getCategoria() {
        return categoria;
    }

    public void setCategoria(Platform categoria) {
        this.categoria = categoria;
    }



    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", publisher='" + publisher + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", categoria=" + categoria + '}';
    }
}


