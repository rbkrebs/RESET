package br.com.cwi.tinderevolution.domain.enums;

public enum Localizacao {

    LATITUTE("Latitude"), LONGITUDE("Longitude");

    private String descricao;
    private int geoNumber;

    Localizacao(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }

    public int getGeoNumber() {
        return geoNumber;
    }

    public void setGeoNumber(int geoNumber) {
        this.geoNumber = geoNumber;
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "descricao='" + descricao + '\'' +
                ", geoNumber=" + geoNumber +
                '}';
    }
}
