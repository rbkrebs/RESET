package br.com.cwi.tinderevolution.rest;


import br.com.cwi.tinderevolution.collection.CuriosityCollection;
import br.com.cwi.tinderevolution.domain.Curiosity;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoCuriosidades;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curiosity")
public class RestCuriosity {

    CuriosityCollection curiosityCollection = new CuriosityCollection();
    GerenciamentoCuriosidades gerenciamentoCuriosidades = new GerenciamentoCuriosidades();

    @GetMapping("{id}")
    public Curiosity findById(@PathVariable("id") int id) {


        return this.curiosityCollection.findById(id);
    }

    @GetMapping
    public List<Curiosity> findAll() {

        return this.curiosityCollection.listAll();
    }

    @PutMapping("{id}")
    public Curiosity update(@PathVariable("id") int id, @RequestBody Curiosity newCuriosity) {

        return curiosityCollection.update(id, newCuriosity);
    }

    @PostMapping
    public Curiosity create(@Validated @RequestBody Curiosity newCuriosity) {

        return this.gerenciamentoCuriosidades.save(newCuriosity);

    }
}
