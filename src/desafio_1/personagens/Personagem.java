package desafio_1.personagens;

import desafio_1.Ataque;

public class Personagem implements Ataque {

    String nome;
    Integer vida;
    Integer ataque;
    Integer defesa;



    public Personagem(String nome, Integer vida, Integer ataque, Integer defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }



    @Override
    public String atacar(Personagem atacado) {
        return "";
    }

    @Override
    public boolean estaVivo() {
        return false;
    }

    @Override
    public String toString() {
        return "\nNome:"+this.nome+"\n"+
                "Vida: "+this.vida;
    }
}
