package ataques;

public class PoderFerramenta {

    private String nome;
    private Double intensidade;
    private static Integer numeroPoderFerramentas = 0;


    public PoderFerramenta(){

    }

    public PoderFerramenta(String nome, Double intensidade){

        this.nome = nome;
        this.intensidade = intensidade;
        numeroPoderFerramentas++;

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

    public static Integer getNumeroPoderFerramentas() {
        return numeroPoderFerramentas;
    }
}


