package personagens.arcano;

import ataques.PoderDivino;
import personagens.Personagem;

public class Druida extends Arcano {

    public Druida(){

    }

    public Druida(String nome, Double vida, Double ataque, Double defesa, Double fe, PoderDivino poderDivino) {
        super(nome, vida, ataque, defesa, fe, poderDivino);
    }

    @Override
    public String mostrarTipo() {
        return "Druida";
    }
}