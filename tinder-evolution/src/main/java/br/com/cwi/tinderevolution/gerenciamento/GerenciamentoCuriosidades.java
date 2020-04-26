package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.CuriosityCollection;
import br.com.cwi.tinderevolution.domain.Curiosity;

import java.util.List;
import java.util.Optional;

public class GerenciamentoCuriosidades {

    CuriosityCollection curiosityCollection = new CuriosityCollection();

    public Curiosity save(Curiosity sport) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(sport)) {

            return this.curiosityCollection.save(sport);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Curiosity sportParam) {
        Optional<Curiosity> sport;
        try {

            sport = Optional.of(this.curiosityCollection.findByDesc(sportParam.getDescription()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (sport.isPresent()) {

            throw new IllegalArgumentException("Descrição já cadastrada");
        }

        return true;

    }

    public Curiosity update(int id, Curiosity newCuriosity) {

        return this.curiosityCollection.update(id, newCuriosity);
    }

    public List<Curiosity> listAll() {

        return this.curiosityCollection.listAll();

    }

    public Curiosity findById(int id) {

        return this.curiosityCollection.findById(id);
    }

    public Boolean delete(Integer id) {

        return this.curiosityCollection.delete(id);

    }
}
