package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.collection.FilmCollection;
import br.com.cwi.tinderevolution.domain.Film;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoFilme;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class RestFilm  {

    FilmCollection filmCollection = new FilmCollection();
    GerenciamentoFilme gerenciamentoFilmes = new GerenciamentoFilme();

    @GetMapping("{id}")
    public Film findById(@PathVariable("id") int id){


        return this.filmCollection.findById(id);
    }

    @GetMapping
    public List<Film> findAll(){

        return this.filmCollection.listAll();
    }

    @PutMapping("{id}")
    public Film update(@PathVariable("id") int id, @RequestBody Film newFilm){

        return filmCollection.update(id, newFilm);
    }

    @PostMapping
    public Film create(@Validated @RequestBody Film newFilm) {

        return this.gerenciamentoFilmes.save(newFilm);

    }
}
