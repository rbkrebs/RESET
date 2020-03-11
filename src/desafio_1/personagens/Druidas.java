package desafio_1.personagens;

import desafio_1.ataques.PoderDivino;

public class Druidas extends Personagem {

    Integer fe;


    PoderDivino poderDivino;

    Druidas(String nome, Integer vida, Integer ataque, Integer defesa, Integer fe , PoderDivino poderDivino){
        super(nome, vida, ataque, defesa);
        this.fe = fe;
        this.poderDivino = poderDivino;


    }

    void usaPoderDivino(){

        this.fe -= this.poderDivino.getCustoFe();

    }
}
