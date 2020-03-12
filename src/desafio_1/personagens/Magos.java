package desafio_1.personagens;

import desafio_1.ataques.Magias;

public class Magos extends Personagem {

    Integer mana;

    Magias magias;

    public Magos(String nome, Integer vida, Integer ataque, Integer defesa, Integer mana , Magias magias){
        super(nome, vida, ataque, defesa);
        this.mana = mana;
        this.magias = magias;

    }

    void usaMagia(){

        this.mana -= this.magias.getCustoMana();

    }
    @Override
    public String atacar(Personagem atacado) {
        Integer poderDeAtaque = this.magias.getIntensidade()*this.ataque;
        Integer dano = poderDeAtaque - this.defesa;
        atacado.vida -= dano;

        return this.nome+" atacou "+atacado.nome+" com "+this.magias.getNome()+" causando "+dano+" de dano";

    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
