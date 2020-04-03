package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.SportCollection;
import br.com.cwi.tinderevolution.domain.Sport;
import br.com.cwi.tinderevolution.domain.enums.Category;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class GerenciamentoEsporte {

    SportCollection sportCollection = new SportCollection();

    public Sport save(Sport sport) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(sport)) {

            return this.sportCollection.save(sport);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Sport sportParam) {
        Optional<Sport> sport;
        try {

            sport = Optional.of(this.sportCollection.findByName(sportParam.getNome()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (sport.isPresent()) {

            throw new IllegalArgumentException("Esporte já cadastrado");
        }

        return true;

    }




}
