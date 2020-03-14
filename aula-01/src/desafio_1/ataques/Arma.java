package desafio_1.ataques;

public class Arma {

    String nome;
    Integer intensidade;

    public Arma(String nome, Integer intensidade){

        this.nome = nome;
        this.intensidade = intensidade;

    }

    public String getNome() {
        return nome;
    }

    public Integer getIntensidade() {
        return intensidade;
    }
}
