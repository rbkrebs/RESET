package br.com.cwi.tinderevolution.rest.musica;


import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoMusica;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class RestMusic  {

    MusicCollection musicCollection = new MusicCollection();
    GerenciamentoMusica gerenciamentoMusica = new GerenciamentoMusica();

    @GetMapping("{id}")
    public Music findById(@PathVariable("id") int id){


        return this.musicCollection.findById(id);
    }

    @GetMapping
    public List<Music> findAll(){

        return this.musicCollection.listAll();
    }

    @PutMapping("{id}")
    public Music update(@PathVariable("id") int id, @RequestBody Music newMusic){

        return musicCollection.update(id, newMusic);
    }

    @PostMapping
    public Music create(@Validated @RequestBody Music newMusic) {

       return this.gerenciamentoMusica.save(newMusic);

    }
}
