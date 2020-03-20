
import ataques.Magia;
import ataques.PoderDivino;
import ataques.PoderFerramenta;
import personagens.Personagem;
import personagens.arcano.Arcano;
import personagens.sacerdote.Sacerdote;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {



    private Menu menu = new Menu();
    private ArrayList<Object> listaPersonagens = new ArrayList<>();
    private ArrayList<Object> listaPoderFerramentas = new ArrayList<>();
    private static final String perguntaPersonagem = "Deseja criar mais um personagem?\n"+
            "0 - Sim\n"+
            "1 - Não\n"+
            "Resposta: ";
    private static final String perguntaPoderFerramenta = "Deseja criar mais uma arma/magia/poder divino?\n"+
            "0 - Sim\n"+
            "1 - Não\n"+
            "Resposta: ";
    private Integer resposta;


    public void criarPersonagens(){


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(this.menu.mostrarMenuPersonagem());
            int iPersonagem = scanner.nextInt();
            Personagem personagem = menu.getListaPersonagens().get(iPersonagem);

            System.out.print("Nome do personagem: ");
            personagem.setNome(scanner.next());
            System.out.print("Vida: ");
            personagem.setVida(scanner.nextDouble());
            System.out.print("Ataque: ");
            personagem.setAtaque(scanner.nextDouble());
            System.out.print("Defesa: ");
            personagem.setDefesa(scanner.nextDouble());


            if ((personagem instanceof Sacerdote)) {
                System.out.print("Mana: ");
                ((Sacerdote) personagem).setMana(scanner.nextDouble());
            } else if (personagem instanceof Arcano) {
                System.out.print("Fe: ");
                ((Arcano) personagem).setFe(scanner.nextDouble());
            }

            listaPersonagens.add(personagem);
            System.out.println(perguntaPersonagem);
            this.resposta = scanner.nextInt();


        }while (this.resposta == 0);

        this.criarArmas();






    }

    public void criarArmas(){

        System.out.println("Bora criar umas armas!!!\n");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(this.menu.mostrarMenuArma());
            int iArma = scanner.nextInt();
            PoderFerramenta poderFerramenta = menu.getListaPoderFerramenta().get(iArma);

            System.out.print("Nome da arma: ");
            poderFerramenta.setNome(scanner.next());
            System.out.print("Intensidade: ");
            poderFerramenta.setIntensidade(scanner.nextDouble());


            if ((poderFerramenta instanceof Magia)) {

                System.out.print(" Custo de mana;: ");
                ((Magia) poderFerramenta).setCustoMana(scanner.nextDouble());

            } else if (poderFerramenta instanceof PoderDivino) {

                System.out.print("Custo de fe: ");
                ((PoderDivino) poderFerramenta).setCustoFe(scanner.nextDouble());
            }

            listaPoderFerramentas.add(poderFerramenta);
            System.out.println(perguntaPoderFerramenta);
            this.resposta = scanner.nextInt();


        }while (this.resposta == 0);


        // para testes
        for (Object p: listaPersonagens){
            System.out.println(p);
        }

        for (Object p: listaPoderFerramentas){
            System.out.println(p);
        }






    }


}
