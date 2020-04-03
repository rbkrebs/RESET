package br.com.cwi.tinderevolution.domain.enums;

public enum CuriosityCategory {

    COMPORTAMENTO("Drama"), EVENTO("Comédia"),
    APARENCIA("Suspense"), ALIMENTACAO("Terror");

    private String descricao;


    CuriosityCategory(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }



}
