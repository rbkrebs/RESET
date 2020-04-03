package br.com.cwi.tinderevolution.domain.enums;

public enum Category {

    DRAMA("Drama"), COMEDIA("Comédia"),
    SUSPENSE("Suspense"), TERROR("Terror"),
    ACAO("Ação"),MUSICAL("Musical");

    private String descricao;


    Category(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return "Category{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
