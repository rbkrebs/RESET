package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.collection.FilmCollection;
import br.com.cwi.tinderevolution.domain.Film;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoFilme;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
@Api(value="API REST Film")
@CrossOrigin(origins = "*")
public class RestFilm  {


    GerenciamentoFilme gerenciamento = new GerenciamentoFilme();

    @GetMapping("{id}")
    @ApiOperation(value = "Retorna um filme")
    public Film findById(@PathVariable("id") Integer id){


        return this.gerenciamento.findById(id);
    }

    @GetMapping
    @ApiOperation(value = "Retorna todos os registro de filmes")
    public List<Film> findAll(){

        return this.gerenciamento.listAll();
    }

    @PutMapping("{id}")
    @ApiOperation(value = "Atualiza um registro de filme")
    public Film update(@PathVariable("id") Integer id, @RequestBody Film newFilm){

        return gerenciamento.update(id, newFilm);
    }

    @PostMapping
    @ApiOperation(value = "Cria um registro de filme")
    public Film create(@Validated @RequestBody Film newFilm) {

        return this.gerenciamento.save(newFilm);

    }
    @DeleteMapping
    @ApiOperation(value = "Deleta um filme")
    public Boolean delete(@PathVariable("id") Integer id){
        return this.gerenciamento.delete(id);
    }
}
