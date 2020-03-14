package exercicio2;

import exercicio2.classes.Autor;
import exercicio2.classes.Livro;
import exercicio2.enums.Categoria;
import exercicio2.enums.Status;


public class Biblioteca {


    public static void main(String[] args) {
        Autor a1 = new Autor("Joselito");
        Livro l1 = new Livro("O retorno", a1, Categoria.ROMANCE, Status.DISPONIVEL);
        Autor a2 = new Autor("Jesus");
        Livro l2 = new Livro("The bible", a2, Categoria.FANTASIA, Status.EMPRESTADO);
        System.out.println(l1);
        System.out.println(l2);
    }







}
