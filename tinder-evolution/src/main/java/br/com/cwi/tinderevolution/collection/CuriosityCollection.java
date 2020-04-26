package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Curiosity;
import br.com.cwi.tinderevolution.domain.Film;
import io.swagger.models.auth.In;

import java.util.ArrayList;
import java.util.List;

public class CuriosityCollection {

    private static int counter = 1;
    private static final List<Curiosity> listCuriosity = new ArrayList<>();


    public Curiosity save(Curiosity curiosity) {
        curiosity.setId(counter++);
        listCuriosity.add(curiosity);
        return curiosity;
    }

    public List<Curiosity> listAll() {
        return listCuriosity;
    }


    public Curiosity findById(int id) {

        return this.listCuriosity.stream().filter(curiosity-> curiosity.getId() == id).findFirst().get();

    }

    public Curiosity findByDesc(String descCuriosity) {

        return this.listCuriosity.stream().filter(curiosity-> curiosity.getDescription().equals(descCuriosity)).findFirst().get();

    }


    public boolean delete(Integer id) {


            Curiosity toDelete = this.findById(id);

            if (!toDelete.equals(null)){
                return listCuriosity.remove(toDelete);
            }
            return false;
        }


    public Curiosity update(int id, Curiosity newCuriosity){

        Curiosity curiosity = findById(id);
        curiosity.setCuriosityCategory(newCuriosity.getCuriosityCategory());
        curiosity.setDescription(newCuriosity.getDescription());


        return curiosity;
    }


}
