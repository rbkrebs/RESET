package desafio_1.personagens;

import desafio_1.ataques.Armas;

public class Barbaros extends Personagem {

    Armas arma;


    public Barbaros(String nome, Integer vida, Integer ataque, Integer defesa, Armas arma) {
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
