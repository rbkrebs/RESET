package exec_3;

public class Aluno {

    String nome;

    float nota;

    Aluno(){

    }

    Aluno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }

    Desempenho desempenho = new Desempenho();

    @Override
    public String toString() {
        return "Nome do aluno: "+this.nome+"\n" +
                "Nota do aluno: "+this.nota+"\n" +
                "Situação do aluno: "+desempenho.situacao(this.nota);
    }
}
