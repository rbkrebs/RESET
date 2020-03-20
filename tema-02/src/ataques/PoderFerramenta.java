package ataques;

public class PoderFerramenta {

    String nome;
    Double intensidade;

    public PoderFerramenta(){

    }

    public PoderFerramenta(String nome, Double intensidade){

        this.nome = nome;
        this.intensidade = intensidade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIntensidade(Double intensidade) {
        this.intensidade = intensidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getIntensidade() {
        return intensidade;
    }

    public String mostrarTipo(){
        return "";
    }
}


