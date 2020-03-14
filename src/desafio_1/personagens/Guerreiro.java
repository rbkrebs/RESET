package desafio_1.personagens;

import desafio_1.ataques.Arma;

public class Guerreiro extends Personagem {

    Arma arma;

    public Guerreiro(String nome, Integer vida, Integer ataque, Integer defesa , Arma arma){
        super(nome, vida, ataque, defesa);
        this.arma = arma;

    }

    @Override
    public String atacar(Personagem atacado) {
        if (this.estaVivo()) {

            Integer poderDeAtaque = this.arma.getIntensidade() * this.ataque;
            Integer dano = Math.abs(poderDeAtaque - atacado.defesa);
            atacado.vida -=  Math.abs(dano);
            if (atacado.vida <= 0) {
                return atacado.nome + " faleceu!!";
            }
            return this.nome + " atacou " + atacado.nome + " com " + this.arma.getNome() + " causando " + dano + " de dano";
        }
            return "";


    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
