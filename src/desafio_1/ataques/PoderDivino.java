package desafio_1.ataques;

public class PoderDivino {

    String nome;
    Integer intensidade;
    Integer custoFe;

    PoderDivino(String nome, Integer intensidade, Integer custoFe){
        this.nome = nome;
        this.intensidade = intensidade;
        this.custoFe = custoFe;
    }

    public Integer getIntensidade() {
        return intensidade;
    }

    public Integer getCustoFe() {
        return custoFe;
    }
}
