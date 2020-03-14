package desafio_1;

import desafio_1.personagens.Personagem;

public interface Ataque<T extends Personagem> {

    public String atacar(T atacado);


    public boolean estaVivo();


}
