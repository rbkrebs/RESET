package exercicio2;

import exercicio2.classes.Autor;
import exercicio2.classes.Livro;
import exercicio2.enums.Categoria;
import exercicio2.enums.Status;


public class App {


    public static void main(String[] args) {
        Autor a1 = new Autor("Joselito");
        Livro l1 = new Livro("O retorno", a1, Categoria.ROMANCE, Status.DISPONIVEL);
        System.out.println(l1);
    }







}
