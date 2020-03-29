package br.com.cwi.tinderevolution.rest.musica;


import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import br.com.cwi.tinderevolution.gerenciamento.Gerenciamento;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/music")
public class RestMusic {

    MusicCollection musicCollection = new MusicCollection();
    Gerenciamento gerenciamento = new Gerenciamento();

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
    public Music create(@Validated @RequestBody Music newMusic){

       return this.gerenciamento.save(newMusic);

    }
}
