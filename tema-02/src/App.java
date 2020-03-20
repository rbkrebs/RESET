

import ataques.Arma;
import ataques.Magia;
import ataques.PoderDivino;
import personagens.*;
import personagens.burro_forte.Barbaro;
import personagens.burro_forte.Guerreiro;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

      /*  Arma arma1 = new Arma("Canivete", 7);
        Arma arma2 = new Arma("Machado", 5);
        Magia magia1 = new Magia("foguete azul", 5, 36);
        Magia magia2 = new Magia("lua de cristal", 9, 76);
        PoderDivino poderDivino1 = new PoderDivino("gloria a deux", 6, 46);
        PoderDivino poderDivino2 = new PoderDivino("aleluia", 2, 12);


        Barbaro b1 = new Barbaro("João1", 300, 2, 50 , arma1);
        Barbaro b2 = new Barbaro("João2", 280, 4, 90 , arma2);
        Clerigo c1 = new Clerigo("Pastor1", 240, 9, 100, 50, poderDivino1);
        Clerigo c2 = new Clerigo("Pastor2", 350, 4, 100, 50, poderDivino2);
        Druida d1 = new Druida("Druida1", 500,10,100,110,poderDivino1);
        Druida d2 = new Druida("Druida2", 500,10,100,100,poderDivino2);
        Feiticeiro f1 = new Feiticeiro("Feiticeiroso1", 230,5,100,100, magia1);
        Feiticeiro f2 = new Feiticeiro("Feiticeiroso2", 310,2,110,100, magia2);
        Guerreiro g1 = new Guerreiro("Bombado1", 400,3,100,arma1);
        Guerreiro g2 = new Guerreiro("Bombado2", 370,6,100,arma2);
        Mago m1 = new Mago("Maguinho", 310,50,100,100, magia1);
        Mago m2 = new Mago("Maguila", 267,47,100,100, magia2);


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
        System.out.println(c2);*/


        Menu menu = new Menu();
        Jogador jogador = new Jogador();
        System.out.println(menu.mostrarMenu());
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        jogador.criarPersonagens(menu.getListaPersonagens().get(i));



    }


}
