package br.com.cwi.tinderevolution.domain;

import br.com.cwi.tinderevolution.domain.enums.MusicStyles;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonSubTypes;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Music {

    private int id;
    @NotNull(message = "O nome é um campo obrigatório")
    private String nome;
    @NotNull(message = "O autor é um campo obrigatório")
    private String autor;
    @NotNull(message = "A data de lançamento é um campo obrigatório")
    private LocalDate dataDeLancamento;
    @NotNull(message = "O estilo de música é um campo obrigatório")
    private MusicStyles musicSyles;

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
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public MusicStyles getMusicSyles() {
        return musicSyles;
    }

    public void setMusicSyles(MusicStyles musicSyles) {
        this.musicSyles = musicSyles;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Autor='" + autor + '\'' +
                ", dataDeLancamento=" + dataDeLancamento +
                ", musicSyles=" + musicSyles +
                '}';
    }
}
