package desafio_1.personagens.burro_forte;

import desafio_1.ataques.Arma;
import desafio_1.personagens.Personagem;

public class Barbaro extends BurroForte {

    public Barbaro(){

    }

    public Barbaro(String nome, Double vida, Double ataque, Double defesa) {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public String mostrarTipo() {
        return "Bárbarop";
    }
}
