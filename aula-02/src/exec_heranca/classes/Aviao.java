package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Aviao extends Aereo {


    public Aviao(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas, Double altitudeMaxima) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas, altitudeMaxima);
    }
}
