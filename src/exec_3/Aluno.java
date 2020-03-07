package exec_3;

public class Aluno {

    String nome;

    float nota;

    Aluno(String nome, float nota){
        this.nome = nome;
        this.nota = nota;
    }

    String situacao(float nota){
        if(nota>=7.0){
            return "Aprovado";
        }
        return "Reprovado";
    }

    @Override
    public String toString() {
        return "Nome do aluno: "+this.nome+"\n" +
                "Nota do aluno: "+this.nota+"\n" +
                "Situação do aluno: "+situacao(this.nota);
    }
}
