package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Aquatico extends Veiculo{

    private Double profundidademaxima;


    public Aquatico(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas, Double profundidademaxima) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas);
        this.profundidademaxima = profundidademaxima;
    }
}
