package exercicio2.enums;

public enum Status {

    DISPONIVEL("Disponível"), EM_USO("Em uso"), EMPRESTADO("Emprestado");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
