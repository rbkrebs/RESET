package br.com.cwi.tinderevolution.rest;


import br.com.cwi.tinderevolution.collection.CuriosityCollection;
import br.com.cwi.tinderevolution.domain.Curiosity;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoCuriosidades;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curiosity")
@Api(value="API REST Curiosity")
@CrossOrigin(origins = "*")
public class RestCuriosity {


    GerenciamentoCuriosidades gerenciamento = new GerenciamentoCuriosidades();

    @GetMapping("{id}")
    @ApiOperation(value = "Retorna uma curiosidade")
    public Curiosity findById(@PathVariable("id") int id) {


        return this.gerenciamento.findById(id);
    }

    @GetMapping
    @ApiOperation(value = "Retorna todos os registro de curiosidades")
    public List<Curiosity> findAll() {

        return this.gerenciamento.listAll();
    }

    @PutMapping("{id}")
    @ApiOperation(value = "Altera o registro de uma curiosidade")
    public Curiosity update(@PathVariable("id") int id, @RequestBody Curiosity newCuriosity) {

        return gerenciamento.update(id, newCuriosity);
    }

    @PostMapping
    @ApiOperation(value = "Cria um registro de curiosidade")
    public Curiosity create(@Validated @RequestBody Curiosity newCuriosity) {

        return this.gerenciamento.save(newCuriosity);

    }

    @DeleteMapping
    @ApiOperation(value = "Deleta uma curiosidade")
    public Boolean delete(@PathVariable("id") Integer id){
        return this.gerenciamento.delete(id);
    }
}
