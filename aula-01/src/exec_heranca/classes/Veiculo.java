package exec_heranca.classes;

import exec_heranca.enums.Combustivel;
import exec_heranca.enums.Terreno;

public class Veiculo {

    private String nome;
    private Double velocidadeMaxima;
    private Combustivel combustivel;
    private Integer lotacaoMaxima;
    private Integer numeroRodas;

    public Veiculo(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas ){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.combustivel = combustivel;
        this.lotacaoMaxima = lotacaoMaxima;
        this.numeroRodas = numeroRodas;
    }
}
