package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Caminhao extends Terrestre {
    public Caminhao(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas);
    }
}
