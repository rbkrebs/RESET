package desafio_1.personagens.arcano;

import desafio_1.ataques.PoderDivino;
import desafio_1.personagens.Personagem;

public class Clerigo extends Arcano {


    public Clerigo(){

    }
    public Clerigo(String nome, Double vida, Double ataque, Double defesa, Double fe, PoderDivino poderDivino) {
        super(nome, vida, ataque, defesa, fe, poderDivino);
    }

    @Override
    public String mostrarTipo() {
        return "Clérigo";
    }
}
