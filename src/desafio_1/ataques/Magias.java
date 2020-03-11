package desafio_1.ataques;

public class Magias {

    String nome;
    Integer intensidade;
    Integer custoMana;

    public Magias(String nome, Integer intesidade, Integer custoMana){

        this.nome = nome;
        this.intensidade = intesidade;
        this.custoMana = custoMana;
    }

    public Integer getIntensidade() {
        return intensidade;
    }

    public Integer getCustoMana() {
        return custoMana;
    }
}
