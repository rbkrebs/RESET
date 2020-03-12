package desafio_1.personagens;

import desafio_1.ataques.PoderDivino;

public class Druidas extends Personagem {

    Integer fe;


    PoderDivino poderDivino;

    public Druidas(String nome, Integer vida, Integer ataque, Integer defesa, Integer fe , PoderDivino poderDivino){
        super(nome, vida, ataque, defesa);
        this.fe = fe;
        this.poderDivino = poderDivino;



    }

    void usaPoderDivino(){

        this.fe -= this.poderDivino.getCustoFe();

    }

    @Override
    public String atacar(Personagem atacado) {
        Integer poderDeAtaque = this.poderDivino.getIntensidade()*this.ataque;
        Integer dano = poderDeAtaque - this.defesa;
        atacado.vida -= dano;

        return this.nome+" atacou "+atacado.nome+" com "+this.poderDivino.getNome()+" causando "+dano+" de dano";
    }


    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }
}
