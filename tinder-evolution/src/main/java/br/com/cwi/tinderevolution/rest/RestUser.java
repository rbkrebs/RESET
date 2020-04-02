package br.com.cwi.tinderevolution.rest;

import br.com.cwi.tinderevolution.collection.UserCollection;

import br.com.cwi.tinderevolution.domain.Users;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoUsuario;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class RestUser  {

    UserCollection userCollection = new UserCollection();
    GerenciamentoUsuario gerenciamentoUsuario = new GerenciamentoUsuario();

    @GetMapping("{id}")
    public Users findById(@PathVariable("id") int id){


        return this.userCollection.findById(id);
    }

    @GetMapping
    public List<Users> findAll(){

        return this.userCollection.listAll();
    }

    @PutMapping("{id}")
    public Users update(@PathVariable("id") int id, @RequestBody Users newUser){

        return userCollection.update(id, newUser);
    }

    @PostMapping
    public Users create(@Validated @RequestBody Users newUser) {

        return this.gerenciamentoUsuario.save(newUser);

    }
}
