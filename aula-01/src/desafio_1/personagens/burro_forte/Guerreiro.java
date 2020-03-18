package desafio_1.personagens.burro_forte;

import desafio_1.ataques.Arma;
import desafio_1.personagens.Personagem;

public class Guerreiro extends Personagem {

    Arma arma;

    public Guerreiro(String nome, Double vida, Double ataque, Double defesa , Arma arma){
        super(nome, vida, ataque, defesa);
        this.arma = arma;

    }




}
