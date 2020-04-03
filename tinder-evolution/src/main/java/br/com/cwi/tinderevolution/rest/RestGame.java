package br.com.cwi.tinderevolution.rest;


import br.com.cwi.tinderevolution.collection.GameCollection;
import br.com.cwi.tinderevolution.domain.Game;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoGame;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class RestGame {

    GameCollection gameCollection = new GameCollection();
    GerenciamentoGame gerenciamentoGame = new GerenciamentoGame();

    @GetMapping("{id}")
    public Game findById(@PathVariable("id") int id) {


        return this.gameCollection.findById(id);
    }

    @GetMapping
    public List<Game> findAll() {

        return this.gameCollection.listAll();
    }

    @PutMapping("{id}")
    public Game update(@PathVariable("id") int id, @RequestBody Game newGame) {

        return gameCollection.update(id, newGame);
    }

    @PostMapping
    public Game create(@Validated @RequestBody Game newGame) {

        return this.gerenciamentoGame.save(newGame);

    }
}
