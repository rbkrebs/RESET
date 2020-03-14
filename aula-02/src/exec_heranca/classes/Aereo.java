package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Aereo extends Veiculo {

    private Double altitudeMaxima;

    public Aereo(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas, Double altitudeMaxima) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas);
        this.altitudeMaxima = altitudeMaxima;
    }
}
