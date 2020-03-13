package desafio_1.personagens;

import desafio_1.ataques.Magias;

public class Magos extends Personagem {

    Integer mana;

    Magias magias;

    public Magos(String nome, Integer vida, Integer ataque, Integer defesa, Integer mana , Magias magias){
        super(nome, vida, ataque, defesa);
        this.mana = mana;
        this.magias = magias;

    }

    void usaMagia(){

        this.mana -= this.magias.getCustoMana();

    }
    @Override
    public String atacar(Personagem atacado) {
        if (this.estaVivo()){
            Integer poderDeAtaque = this.magias.getIntensidade()*this.ataque;
            Integer dano = Math.abs(poderDeAtaque - atacado.defesa);

            if (this.temFe()){
                usaMagia();
                atacado.vida -=  dano;
                if (atacado.vida<=0){
                    return atacado.nome + " faleceu!!";
                }
                return this.nome+" atacou "+atacado.nome+" com "+this.magias.getNome()+" causando "+dano+" de dano";
            }

            else{
                return this.nome+" não tem mais fé";
            }
        }
            return "";



    }

    public boolean temFe(){
        return this.mana>=this.magias.getCustoMana();
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
