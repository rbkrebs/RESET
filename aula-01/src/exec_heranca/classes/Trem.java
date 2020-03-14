package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Trem extends Terrestre {
    public Trem(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas);
    }
}
