package br.com.cwi.tinderevolution.rest.musica;


import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/music")
public class RestMusic {

    MusicCollection musicCollection = new MusicCollection();

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
    public Music create(@RequestBody Music newMusic){

       return this.musicCollection.save(newMusic);

    }
}
