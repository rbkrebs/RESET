package ataques;

public class Magia extends PoderFerramenta {


    Double custoMana;

    public Magia(){

    }

    public Magia(String nome, Double intensidade, Double custoMana) {
        super(nome, intensidade);
        this.custoMana = custoMana;

    }


    public void setCustoMana(Double custoMana) {
        this.custoMana = custoMana;
    }

    public Double getCustoMana() {
        return custoMana;
    }

    @Override
    public String mostrarTipo() {
        return "Magia";
    }
}
