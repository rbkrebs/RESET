package ataques;

public class PoderDivino extends PoderFerramenta {


    Double custoFe;

    public PoderDivino(String nome, Double intensidade, Double custoFe) {
        super(nome, intensidade);
        this.custoFe = custoFe;
    }


    public Double getCustoFe() {
        return custoFe;
    }

}
