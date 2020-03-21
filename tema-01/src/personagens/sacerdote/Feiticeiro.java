package desafio_1.personagens.sacerdote;

import desafio_1.ataques.Magia;
import desafio_1.personagens.Personagem;

public class Feiticeiro extends Sacerdote {


    public Feiticeiro(){

    }

    public Feiticeiro(String nome, Double vida, Double ataque, Double defesa, Double mana, Magia magia) {
        super(nome, vida, ataque, defesa, mana, magia);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Mana: "+String.valueOf(this.getMana());
    }

    @Override
    public String mostrarTipo() {
        return "Sacerdote";
    }

}
