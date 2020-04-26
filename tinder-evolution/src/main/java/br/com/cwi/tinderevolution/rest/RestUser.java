package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.collection.UserCollection;

import br.com.cwi.tinderevolution.domain.Users;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoUsuario;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value="API REST User")
@CrossOrigin(origins = "*")
public class RestUser  {


    GerenciamentoUsuario gerenciamento = new GerenciamentoUsuario();

    @GetMapping("{id}")
    public Users findById(@PathVariable("id") Integer id){


        return this.gerenciamento.findById(id);
    }

    @GetMapping
    public List<Users> findAll(){

        return this.gerenciamento.listAll();
    }

    @PutMapping("{id}")
    public Users update(@PathVariable("id") Integer id, @RequestBody Users newUser){

        return gerenciamento.update(id, newUser);
    }

    @PostMapping
    public Users create(@Validated @RequestBody Users newUser) {

        return this.gerenciamento.save(newUser);

    }
}
