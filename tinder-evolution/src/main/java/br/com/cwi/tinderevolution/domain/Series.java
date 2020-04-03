package br.com.cwi.tinderevolution.domain;



import br.com.cwi.tinderevolution.domain.enums.Category;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Series {

    private int id;
    @NotNull(message = "O nome é um campo obrigatório")
    private String nome;
    @NotNull(message = "O diretor é um campo obrigatório")
    private String diretor;
    @NotNull(message = "A data de lançamento é um campo obrigatório")
    private LocalDate dataDeLancamento;
    @NotNull(message = "O número de temporadas é um campo obrigatório")
    private int numeroTemporadas;
    @NotNull(message = "O número de episódio é um campo obrigatório")
    private int numeroEpisodios;
    @NotNull(message = "A categoria é um campo obrigatório")
    private Category category;
    @NotNull(message = "A sinopse é um campo obrigatório")
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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
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
        return "Series{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", numeroTemporadas=" + numeroTemporadas +
                ", numeroEpisodios=" + numeroEpisodios +
                ", category=" + category +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
