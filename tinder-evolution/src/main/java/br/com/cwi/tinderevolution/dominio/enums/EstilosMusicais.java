public enum EstilosMusicais {

    SERTANEJO("Sertanejo"), ROCK("Rock"),
    SAMBA("Samba"), PAGODE("Pagode"),
    ELETRONICA("Eletronica"), CLASSICA("Classica");

    private String descricao;

    EstilosMusicais(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
