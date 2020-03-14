package exercicio2.classes;

public class Autor {

    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
