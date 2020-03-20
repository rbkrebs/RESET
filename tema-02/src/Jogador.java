
import personagens.Personagem;
import personagens.arcano.Arcano;
import personagens.sacerdote.Sacerdote;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {




    private ArrayList<Object> listaPersonagens = null;


    public void criarPersonagens(Personagem personagem){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do personagem: ");
        personagem.setNome(scanner.next());
        System.out.print("Vida: ");
        personagem.setVida(scanner.nextDouble());
        System.out.print("Ataque: ");
        personagem.setAtaque(scanner.nextDouble());
        System.out.print("Defesa: ");
        personagem.setDefesa(scanner.nextDouble());


        if (( personagem instanceof Sacerdote)){
            System.out.print("Mana: ");
            ((Sacerdote) personagem).setMana(scanner.nextDouble());
        }
        else if(personagem instanceof Arcano){
            System.out.print("Fe: ");
            ((Arcano) personagem).setFe(scanner.nextDouble());
        }







    }


}
