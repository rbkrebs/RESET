
import ataques.Arma;
import ataques.Magia;
import ataques.PoderDivino;
import ataques.PoderFerramenta;
import personagens.Personagem;
import personagens.arcano.Clerigo;
import personagens.arcano.Druida;
import personagens.burro_forte.Barbaro;
import personagens.burro_forte.Guerreiro;
import personagens.sacerdote.Feiticeiro;
import personagens.sacerdote.Mago;

import java.util.ArrayList;

public class Menu {

    ArrayList<Personagem> listaPersonagens = new ArrayList<>();
    ArrayList<PoderFerramenta> listaPoderFerramenta = new ArrayList<>();




    public String mostrarMenuPersonagem(){

        this.listaPersonagens.clear();

        this.listaPersonagens.add(new Clerigo());
        this.listaPersonagens.add(new Druida());
        this.listaPersonagens.add( new Barbaro());
        this.listaPersonagens.add(new Guerreiro());
        this.listaPersonagens.add(new Mago());
        this.listaPersonagens.add(new Feiticeiro());

        String menu = "Escolha um dos personagens a seguir:\n";

        for (Personagem personagem: this.listaPersonagens){
            menu += this.listaPersonagens.indexOf(personagem) +" - " + personagem.mostrarTipo()+"\n";
        }

        return menu + "Resposta: ";
    }

    public String mostrarMenuArma(){

        this.listaPoderFerramenta.clear();

        this.listaPoderFerramenta.add(new Arma());
        this.listaPoderFerramenta.add(new Magia());
        this.listaPoderFerramenta.add( new PoderDivino());

        String menu = "Escolha uma das armas a seguir:\n";

        for (PoderFerramenta poderFerramenta: this.listaPoderFerramenta){
            menu += this.listaPoderFerramenta.indexOf(poderFerramenta) +" - " + poderFerramenta.mostrarTipo()+"\n";
        }

        return menu + "Resposta: ";
    }

    public String mostrarMenuBatalha(){

      String menu = "Bora começar a brincadeira. Escolha umas das opções a seguir:\n"+
              "1 - Equipar\n"+
              "2 - Atacar\n"+
              "3 - Encerrar";

        return menu + "Resposta: ";
    }



    public ArrayList<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public ArrayList<PoderFerramenta> getListaPoderFerramenta() {
        return listaPoderFerramenta;
    }
}
