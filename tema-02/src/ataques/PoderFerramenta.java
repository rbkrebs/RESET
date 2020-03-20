package ataques;

public class PoderFerramenta {

    String nome;
    Double intensidade;

    public PoderFerramenta(String nome, Double intensidade){

        this.nome = nome;
        this.intensidade = intensidade;

    }

    public String getNome() {
        return nome;
    }

    public Double getIntensidade() {
        return intensidade;
    }
}


