package exercicio2.enums;

public enum Categoria {

    SUSPENSE("Suspense"), ROMANCE("Romance"), FANTASIA("Fantasia"), TERROR("Terror");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return this.descricao;
    }

}

