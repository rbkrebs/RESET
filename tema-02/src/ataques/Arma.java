package ataques;

public class Arma extends PoderFerramenta {

    public Arma(){


    }


    public Arma(String nome, Double intensidade) {
        super(nome, intensidade);
    }

    @Override
    public String mostrarTipo() {
        return "Arma";
    }
}
