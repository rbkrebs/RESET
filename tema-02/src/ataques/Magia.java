package desafio_1.ataques;

public class Magia extends PoderFerramenta {


    Double custoMana;

    public Magia(String nome, Double intensidade, Double custoMana) {
        super(nome, intensidade);
        this.custoMana = custoMana;

    }






    public Double getCustoMana() {
        return custoMana;
    }
}
