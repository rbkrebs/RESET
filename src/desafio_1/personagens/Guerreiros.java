package desafio_1.personagens;

import desafio_1.ataques.Armas;

public class Guerreiros extends Personagem {

    Armas arma;

    public Guerreiros(String nome, Integer vida, Integer ataque, Integer defesa , Armas arma){
        super(nome, vida, ataque, defesa);
        this.arma = arma;

    }
}
