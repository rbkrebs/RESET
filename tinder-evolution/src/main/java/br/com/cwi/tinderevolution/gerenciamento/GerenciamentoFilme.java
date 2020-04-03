package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.FilmCollection;
import br.com.cwi.tinderevolution.domain.Film;
import br.com.cwi.tinderevolution.domain.enums.Category;


import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class GerenciamentoFilme {

    FilmCollection filmCollection = new FilmCollection();

    public Film save(Film film) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(film) && verificaDataRegistro(film) && verificaEstilos(film)) {

            return this.filmCollection.save(film);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Film filmParam) {
        Optional<Film> film;
        try {

            film = Optional.of(this.filmCollection.findByName(filmParam.getNome()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (film.isPresent()) {

            throw new IllegalArgumentException("Filme já cadastrada");
        }

        return true;

    }

    public boolean verificaDataRegistro(Film filmParam) {

        if (!Period.between(filmParam.getDataDeLancamento(), LocalDate.now()).isNegative()) {
            return true;
        }

        throw new IllegalArgumentException("Verifique a data de lançamento");

    }

    public boolean verificaEstilos(Film filmParam) {

        if (filmParam.getCategory() instanceof Category) {
            return true;
        }

        throw new IllegalArgumentException("Estilo não contemplado no escopo");


    }
}
