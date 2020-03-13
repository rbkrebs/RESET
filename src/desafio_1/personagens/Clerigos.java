package desafio_1.personagens;

import desafio_1.ataques.PoderDivino;

public class Clerigos extends Personagem{

    Integer fe;

    PoderDivino poderDivino;

    public Clerigos(String nome, Integer vida, Integer ataque, Integer defesa, Integer fe , PoderDivino poderDivino){
        super(nome, vida, ataque, defesa);
        this.fe = fe;
        this.poderDivino = poderDivino;

    }

    void usaPoderDivino(){

        this.fe -= this.poderDivino.getCustoFe();

    }

    @Override
    public String atacar(Personagem atacado) {
        if (this.estaVivo()) {
            Integer poderDeAtaque = this.poderDivino.getIntensidade() * this.ataque;
            Integer dano = Math.abs(poderDeAtaque - atacado.defesa);
            if (this.temFe()) {
                usaPoderDivino();
                atacado.vida -=  Math.abs(dano);
                if (atacado.vida <= 0) {
                    return atacado.nome + " faleceu!!";
                }
                return this.nome + " atacou " + atacado.nome + " com " + this.poderDivino.getNome() + " causando " + dano + " de dano";
            } else {
                return this.nome + " não tem mais fé";
            }
        }
            return "";



    }

    public boolean temFe(){
        return this.fe>=this.poderDivino.getCustoFe();
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Fe: "+String.valueOf(this.fe);
    }
}
