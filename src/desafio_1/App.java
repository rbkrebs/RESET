package desafio_1;

import desafio_1.ataques.Armas;
import desafio_1.ataques.Magias;
import desafio_1.ataques.PoderDivino;
import desafio_1.personagens.*;

public class App {

    public static void main(String[] args) {

        Armas arma1 = new Armas("Canivete", 75);
        Armas arma2 = new Armas("Machado", 35);
        Magias magias1 = new Magias("foguete azul", 50, 36);
        Magias magias2 = new Magias("lua de cristal", 98, 76);
        PoderDivino poderDivino1 = new PoderDivino("gloria a deux", 56, 46);
        PoderDivino poderDivino2 = new PoderDivino("aleluia", 26, 12);


        Barbaros b1 = new Barbaros("João1", 100, 100, 50 , arma1);
        Barbaros b2 = new Barbaros("João2", 80, 150, 90 , arma2);
        Clerigos c1 = new Clerigos("Pastor", 100, 100, 100, 50, poderDivino1);
        Clerigos c2 = new Clerigos("Pastor", 100, 100, 100, 50, poderDivino2);
        Druidas d1 = new Druidas("Druida1", 100,100,100,100,poderDivino1);
        Druidas d2 = new Druidas("Druida2", 100,100,100,100,poderDivino2);
        Feiticeiros f1 = new Feiticeiros("Feiticeiroso", 100,100,100,100,magias1);
        Feiticeiros f2 = new Feiticeiros("Feiticeiroso", 100,100,100,100,magias2);
        Guerreiros g1 = new Guerreiros("Bombado1", 100,100,100,arma1);
        Guerreiros g2 = new Guerreiros("Bombado2", 100,100,100,arma2);
        Magos m1 = new Magos("Maguinho", 100,100,100,100,magias1);
        Magos m2 = new Magos("Maguila", 100,100,100,100,magias2);


        System.out.println("########## Primeira rodada ##########");

        System.out.println(g1.atacar(m1));
        System.out.println(g1.atacar(g2));


    }


}
