package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Game;

import java.util.ArrayList;
import java.util.List;

public class GameCollection {

    private static int counter = 1;
    private static final List<Game> listGame = new ArrayList<>();


    public Game save(Game game) {
        game.setId(counter++);
        listGame.add(game);
        return game;
    }


    public List<Game> listAll() {
        return listGame;
    }


    public Game findById(int id) {


        return this.listGame.stream().filter(game-> game.getId() == id).findFirst().get();



    }

    public Game findByName(String nomeGame) {

        return this.listGame.stream().filter(game-> game.getNome().equals(nomeGame)).findFirst().get();

    }


    public boolean delete(int id) {
        return false;
    }


    public Game update(int id, Game newGame){


        Game game = findById(id);
        game.setPublisher(newGame.getPublisher());
        game.setDataDeLancamento(newGame.getDataDeLancamento());
        game.setNome(newGame.getNome());
        game.setCategoria(newGame.getCategoria());


        return game;
    }
}
