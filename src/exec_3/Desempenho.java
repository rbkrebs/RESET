package exec_3;

public class Desempenho {

    float MINIMO = 7.0F;

    String situacao(float nota){
        if(nota>=MINIMO){
            return "Aprovado";
        }
        return "Reprovado";
    }
}
