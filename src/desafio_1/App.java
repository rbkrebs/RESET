package desafio_1;

import desafio_1.ataques.Armas;
import desafio_1.ataques.Magias;
import desafio_1.ataques.PoderDivino;
import desafio_1.personagens.*;

public class App {

    public static void main(String[] args) {

        Armas arma1 = new Armas("Canivete", 7);
        Armas arma2 = new Armas("Machado", 5);
        Magias magias1 = new Magias("foguete azul", 5, 36);
        Magias magias2 = new Magias("lua de cristal", 9, 76);
        PoderDivino poderDivino1 = new PoderDivino("gloria a deux", 6, 46);
        PoderDivino poderDivino2 = new PoderDivino("aleluia", 2, 12);


        Barbaros b1 = new Barbaros("João1", 300, 2, 50 , arma1);
        Barbaros b2 = new Barbaros("João2", 280, 4, 90 , arma2);
        Clerigos c1 = new Clerigos("Pastor1", 240, 9, 100, 50, poderDivino1);
        Clerigos c2 = new Clerigos("Pastor2", 350, 4, 100, 50, poderDivino2);
        Druidas d1 = new Druidas("Druida1", 500,10,100,110,poderDivino1);
        Druidas d2 = new Druidas("Druida2", 500,10,100,100,poderDivino2);
        Feiticeiros f1 = new Feiticeiros("Feiticeiroso1", 230,5,100,100,magias1);
        Feiticeiros f2 = new Feiticeiros("Feiticeiroso2", 310,2,110,100,magias2);
        Guerreiros g1 = new Guerreiros("Bombado1", 400,3,100,arma1);
        Guerreiros g2 = new Guerreiros("Bombado2", 370,6,100,arma2);
        Magos m1 = new Magos("Maguinho", 310,50,100,100,magias1);
        Magos m2 = new Magos("Maguila", 267,47,100,100,magias2);


        System.out.println("########## Batalha ##########");

        System.out.println(g1.atacar(m1));
        System.out.println(g1.atacar(g2));
        System.out.println(m1.atacar(d1));
        System.out.println(m1.atacar(m1));
        System.out.println(f1.atacar(f2));
        System.out.println(f1.atacar(d2));
        System.out.println(d1.atacar(f2));
        System.out.println(d1.atacar(b2));
        System.out.println(c1.atacar(b1));
        System.out.println(c1.atacar(m2));

        System.out.println("########## Final ##########");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(c1);
        System.out.println(c2);




    }


}
