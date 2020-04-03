package br.com.cwi.tinderevolution.domain.enums;

public enum Platform {

    XBOX("Xbox"), PS4("Ps4"),
    PC("PC"), SNES("Snes");

    private String descricao;


    Platform(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return "Platform{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
