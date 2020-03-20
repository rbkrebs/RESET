package desafio_1;

import desafio_1.personagens.Personagem;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {



    private Integer NUMERO_CLASSES = 6;
    private ArrayList<Personagem> listaPersonagens = null;


    public void criarPersonagens(){

        Scanner scanner = new Scanner(System.in);


        if (this.listaPersonagens.size()>0){
            while (this.listaPersonagens.size()<this.NUMERO_CLASSES){

                System.out.println("Nome do personagem");


            }
        }
        else {
            System.out.println("tahokey");
            return;
        }




    }


}
