package desafio_1;

import desafio_1.personagens.Personagem;
import desafio_1.personagens.arcano.Clerigo;
import desafio_1.personagens.arcano.Druida;
import desafio_1.personagens.burro_forte.Barbaro;
import desafio_1.personagens.burro_forte.Guerreiro;
import desafio_1.personagens.sacerdote.Feiticeiro;
import desafio_1.personagens.sacerdote.Mago;

import java.util.ArrayList;

public class Menu {

    ArrayList<Personagem> listaPersonagens = new ArrayList<>();

    public String mostrarMenu(){

        this.listaPersonagens.add(new Clerigo());
        this.listaPersonagens.add(new Druida());
        this.listaPersonagens.add( new Barbaro());
        this.listaPersonagens.add(new Guerreiro());
        this.listaPersonagens.add(new Mago());
        this.listaPersonagens.add(new Feiticeiro());

        String menu = "Escolha uma das classes a seguir:\n";

        for (Personagem personagem: this.listaPersonagens){
            menu += listaPersonagens.indexOf(personagem) +" - " + personagem.mostrarTipo()+"\n";
        }

        return menu;

    }



    public ArrayList<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }
}
