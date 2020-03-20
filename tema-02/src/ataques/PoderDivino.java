package ataques;

public class PoderDivino extends PoderFerramenta {


    Double custoFe;

    public PoderDivino(){

    }

    public PoderDivino(String nome, Double intensidade, Double custoFe) {
        super(nome, intensidade);
        this.custoFe = custoFe;
    }

    public void setCustoFe(Double custoFe) {
        this.custoFe = custoFe;
    }

    public Double getCustoFe() {
        return custoFe;
    }

    @Override
    public String mostrarTipo() {
        return "Poder Divino";
    }
}
