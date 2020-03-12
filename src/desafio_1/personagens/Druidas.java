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

    @Override
    public Integer atacar() {
        return this.poderDivino.getIntensidade()*this.ataque;
    }

    @Override
    public Integer receberAtaque(Integer ataque) {

        return ataque - this.defesa;
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
