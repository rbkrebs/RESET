package desafio_1.personagens;

import desafio_1.ataques.Magia;

public class Mago extends Personagem {

    Integer mana;

    Magia magia;

    public Mago(String nome, Integer vida, Integer ataque, Integer defesa, Integer mana , Magia magia){
        super(nome, vida, ataque, defesa);
        this.mana = mana;
        this.magia = magia;

    }

    void usaMagia(){

        this.mana -= this.magia.getCustoMana();

    }
    @Override
    public String atacar(Personagem atacado) {
        if (this.estaVivo()){
            Integer poderDeAtaque = this.magia.getIntensidade()*this.ataque;
            Integer dano = Math.abs(poderDeAtaque - atacado.defesa);

            if (this.temFe()){
                usaMagia();
                atacado.vida -=  dano;
                if (atacado.vida<=0){
                    return atacado.nome + " faleceu!!";
                }
                return this.nome+" atacou "+atacado.nome+" com "+this.magia.getNome()+" causando "+dano+" de dano";
            }

            else{
                return this.nome+" não tem mais fé";
            }
        }
            return "";



    }

    public boolean temFe(){
        return this.mana>=this.magia.getCustoMana();
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Mana: "+String.valueOf(this.mana);
    }
}
