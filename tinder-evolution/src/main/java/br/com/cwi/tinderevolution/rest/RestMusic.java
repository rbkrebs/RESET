package br.com.cwi.tinderevolution.rest;


import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoMusica;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
@Api(value="API REST Music")
@CrossOrigin(origins = "*")
public class RestMusic  {

    MusicCollection musicCollection = new MusicCollection();
    GerenciamentoMusica gerenciamentoMusica = new GerenciamentoMusica();

    @GetMapping("{id}")
    @ApiOperation(value = "Retorna uma música")
    public Music findById(@PathVariable("id") int id){


        return this.musicCollection.findById(id);
    }

    @GetMapping
    @ApiOperation(value = "Retorna todas as músicas salvas")
    public List<Music> findAll(){

        return this.musicCollection.listAll();
    }

    @PutMapping("{id}")
    @ApiOperation(value = "Altera o cadastro de uma música")
    public Music update(@PathVariable("id") int id, @RequestBody Music newMusic){

        return musicCollection.update(id, newMusic);
    }

    @PostMapping
    @ApiOperation(value = "Cria o registro de uma música")
    public Music create(@Validated @RequestBody Music newMusic) {

       return this.gerenciamentoMusica.save(newMusic);

    }
}
