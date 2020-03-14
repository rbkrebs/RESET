package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Bicicleta extends Terrestre {
    public Bicicleta(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas);
    }
}
