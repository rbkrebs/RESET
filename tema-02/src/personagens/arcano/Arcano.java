package desafio_1.personagens.arcano;

import desafio_1.ataques.PoderDivino;
import desafio_1.personagens.Personagem;

public abstract class Arcano extends Personagem {

    Double fe;

    PoderDivino poderDivino;

    public Arcano(){

    }

    public Arcano(String nome, Double vida, Double ataque, Double defesa,Double fe, PoderDivino poderDivino) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
        this.poderDivino = poderDivino;
    }

    public Double getFe() {
        return fe;
    }

    public void setFe(Double fe) {
        this.fe = fe;
    }

    public void usaPoderDivino(){

        this.setFe(this.getFe()-this.poderDivino.getCustoFe());

    }
    public boolean temFe(){
        return this.fe>=this.poderDivino.getCustoFe();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Fe: "+String.valueOf(this.getFe());
    }

}
