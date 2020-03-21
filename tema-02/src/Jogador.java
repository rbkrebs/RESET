
import ataques.Arma;
import ataques.Magia;
import ataques.PoderDivino;
import ataques.PoderFerramenta;
import personagens.Personagem;
import personagens.arcano.Arcano;
import personagens.burro_forte.BurroForte;
import personagens.sacerdote.Sacerdote;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {



    private Menu menu = new Menu();
    private Batalha batalha = new Batalha();
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
    private Scanner scanner = new Scanner(System.in);
    private Integer iOpcao;


    public void criarPersonagens(){


        do {

            System.out.println(this.menu.mostrarMenuPersonagem());
            this.iOpcao = scanner.nextInt();
            Personagem personagem = menu.getListaPersonagens().get(this.iOpcao);

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

            System.out.println(this.menu.mostrarMenuArma());
            this.iOpcao = scanner.nextInt();
            PoderFerramenta poderFerramenta = menu.getListaPoderFerramenta().get(this.iOpcao);

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

    this.iniciarBatalha();

    }

    public void iniciarBatalha(){

        do {
            this.menu.mostrarMenuBatalha();

            this.iOpcao = scanner.nextInt();

            switch (iOpcao) {
                case 1:
                    this.equipar();
                    break;
                case 2:
                    this.batalha.atacar();
                    break;
            }

        }while (this.iOpcao!=3);

    }

    public void equipar(){

        do {
            System.out.println("Escolha qual Homem de Arma você quer equipar");
            for(Object personagem: listaPersonagens){
                if(personagem instanceof BurroForte){
                    System.out.println(this.listaPersonagens.indexOf(personagem)+" - "+((BurroForte) personagem).getNome());
                }
                else
                    System.out.println("Opção errada!");

            }

        }while (!(this.listaPersonagens.get(this.iOpcao) instanceof BurroForte));

        this.iOpcao = scanner.nextInt();

        do {
            System.out.println("Escolha qual uma arma para equipar");
            for(Object arma: listaPoderFerramentas){
                if(arma instanceof Arma){
                    System.out.println(this.listaPoderFerramentas.indexOf(arma)+" - "+((Arma) arma).getNome());
                }
                else
                    System.out.println("Opção errada!");

            }
        
        }while (!(this.listaPoderFerramentas.get(this.iOpcao) instanceof BurroForte));


    }


}
