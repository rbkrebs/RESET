package personagens;


import ataques.PoderFerramenta;

public abstract class Personagem {

    private String nome;
    private Double vida;
    private Double ataque;
    private Double defesa;
    private Double poderDeAtaque;

    public Personagem(){

    }

    public Personagem(String nome, Double vida, Double ataque, Double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected Double getVida() {
        return vida;
    }

    protected void setVida(Double vida) {
        this.vida = vida;
    }

    protected Double getAtaque() {
        return ataque;
    }

    protected void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    protected Double getDefesa() {
        return defesa;
    }

    protected void setDefesa(Double defesa) {
        this.defesa = defesa;
    }

    protected String atacar(Personagem atacado, PoderFerramenta poderFerramenta){


        Double poderDeAtaque = poderFerramenta.getIntensidade() * this.getAtaque();
        Double dano = verificarDano(poderDeAtaque, atacado.getDefesa());
        atualizaVida(atacado, dano);

        if (atacado.getVida() <= 0) {
            return atacado.getNome() + " faleceu!!";
        }
        return this.getNome() + " atacou " + atacado.getNome() + " com " + poderFerramenta.getNome() + " causando " + dano + " de dano";


    }

    public String mostrarTipo(){
        return "";
    }


    protected void atualizaVida(Personagem atacado, Double dano) {
        atacado.setVida((atacado.getVida()- Math.abs(dano)));
    }

    protected Double verificarDano(Double poderDeAtaque, Double defesa) {
        return Math.abs(poderDeAtaque - defesa);
    }




    protected boolean estaVivo() {
        return this.getVida()>0;
    }



    @Override
    public String toString() {
        return "\nNome:"+this.nome+"\n"+
                "Vida: "+this.vida;
    }
}
