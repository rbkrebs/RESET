package personagens.burro_forte;

import ataques.Arma;
import personagens.Personagem;

public abstract class BurroForte extends Personagem {

    private Arma arma;

    public BurroForte(){

    }
    public BurroForte(String nome, Double vida, Double ataque, Double defesa) {
        super(nome, vida, ataque, defesa);
    }


    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
