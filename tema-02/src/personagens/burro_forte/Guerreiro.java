package personagens.burro_forte;

import ataques.Arma;
import personagens.Personagem;

public class Guerreiro extends Personagem {

    Arma arma;

    public Guerreiro(){

    }

    public Guerreiro(String nome, Double vida, Double ataque, Double defesa , Arma arma){
        super(nome, vida, ataque, defesa);
        this.arma = arma;

    }


    @Override
    public String mostrarTipo() {
        return "Guerreiro";
    }

}
