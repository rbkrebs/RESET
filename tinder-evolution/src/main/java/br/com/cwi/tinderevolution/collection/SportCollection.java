package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Sport;

import java.util.ArrayList;
import java.util.List;

public class SportCollection {

    private static int counter = 1;
    private static final List<Sport> listSport = new ArrayList<>();


    public Sport save(Sport sport) {
        sport.setId(counter++);
        listSport.add(sport);
        return sport;
    }

    public List<Sport> listAll() {
        return listSport;
    }


    public Sport findById(int id) {

        return this.listSport.stream().filter(sport-> sport.getId() == id).findFirst().get();
    }

    public Sport findByName(String nomeSport) {

        return this.listSport.stream().filter(sport-> sport.getNome().equals(nomeSport)).findFirst().get();

    }

    public boolean delete(int id) {
        return false;
    }

    public Sport update(int id, Sport newSport){

        Sport sport = findById(id);
        sport.setNome(newSport.getNome());
        return sport;
    }
}
