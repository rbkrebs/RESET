package desafio_1.personagens;

import desafio_1.ataques.Armas;

public class Barbaros extends Personagem{

    Armas arma;


    Barbaros(String nome, Integer vida, Integer ataque, Integer defesa , Armas arma){
        super(nome, vida, ataque, defesa);
        this.arma = arma;

    }

    @Override
    public Integer atacar() {
        return this.arma.getIntensidade()*this.ataque;
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
