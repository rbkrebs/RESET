package personagens.burro_forte;

import ataques.Arma;
import personagens.Personagem;

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
