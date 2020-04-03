package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.GameCollection;
import br.com.cwi.tinderevolution.domain.Game;
import br.com.cwi.tinderevolution.domain.enums.Category;
import br.com.cwi.tinderevolution.domain.enums.Platform;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class GerenciamentoGame {

    GameCollection gameCollection = new GameCollection();

    public Game save(Game game) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(game) && verificaDataRegistro(game) && verificaEstilos(game) && verificaPlataforma(game)) {

            return this.gameCollection.save(game);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Game gameParam) {
        Optional<Game> game;
        try {

            game = Optional.of(this.gameCollection.findByName(gameParam.getNome()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (game.isPresent()) {

            throw new IllegalArgumentException("Jogo já cadastrado");
        }

        return true;

    }

    public boolean verificaDataRegistro(Game gameParam) {

        if (!Period.between(gameParam.getDataDeLancamento(), LocalDate.now()).isNegative()) {
            return true;
        }

        throw new IllegalArgumentException("Verifique a data de lançamento");

    }

    public boolean verificaEstilos(Game gameParam) {

        if (gameParam.getCategoria() instanceof Category) {
            return true;
        }

        throw new IllegalArgumentException("Categoria não contemplado no escopo");


    }
    public boolean verificaPlataforma(Game gameParam) {

        if (gameParam.getPlatform() instanceof Platform) {
            return true;
        }

        throw new IllegalArgumentException("Plataforma não contemplado no escopo");


    }
}
