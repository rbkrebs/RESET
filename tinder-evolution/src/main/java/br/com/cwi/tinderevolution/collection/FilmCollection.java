package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Film;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilmCollection {

    private static int counter = 1;
    private static final List<Film> listFilm = new ArrayList<>();


    public Film save(Film film) {
        film.setId(counter++);
        listFilm.add(film);
        return film;
    }


    public List<Film> listAll() {
        return listFilm;
    }


    public Film findById(Integer id) {


        return this.listFilm.stream().filter(film-> film.getId() == id).findFirst().get();



    }

    public Film findByName(String nomeFilm) {

        return this.listFilm.stream().filter(film-> film.getNome().equals(nomeFilm)).findFirst().get();

    }


    public boolean delete(Integer id) {

        Film toDelete = this.findById(id);

        if (!toDelete.equals(null)){
            return listFilm.remove(toDelete);
        }
        return false;
    }


    public Film update(Integer id, Film newFilm){


        Film film = findById(id);
        film.setDiretor(newFilm.getDiretor());
        film.setDataDeLancamento(newFilm.getDataDeLancamento());
        film.setNome(newFilm.getNome());
        film.setCategory(newFilm.getCategory());
        film.setSinopse(newFilm.getSinopse());

        return film;
    }
}
