package desafio_1.personagens;

import desafio_1.ataques.Armas;

public class Barbaros extends Personagem{

    Armas arma;



    public Barbaros(String nome, Integer vida, Integer ataque, Integer defesa , Armas arma){
        super(nome, vida, ataque, defesa);
        this.arma = arma;

    }



    @Override
    public String atacar(Personagem atacado) {


        Integer poderDeAtaque = this.arma.getIntensidade()*this.ataque;
        Integer dano = poderDeAtaque - this.defesa;
        atacado.vida -= dano;

        return this.nome+" atacou "+atacado.nome+" com "+this.arma.getNome()+" causando "+dano+" de dano";

    }



    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }


}
