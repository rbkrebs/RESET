package personagens.sacerdote;

import ataques.Magia;
import personagens.Personagem;

public class Mago extends Sacerdote {


    public Mago(){

    }

    public Mago(String nome, Double vida, Double ataque, Double defesa, Double mana, Magia magia) {
        super(nome, vida, ataque, defesa, mana, magia);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Mana: "+String.valueOf(this.getMana());
    }

    @Override
    public String mostrarTipo() {
        return "Mago";
    }
}
