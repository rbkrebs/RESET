package exec_3;

import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Aluno aluno4 = new Aluno();
        
        //Trecho apenas para brincar
        aluno4.nome = JOptionPane.showInputDialog("Por favor, escreva nome do aluno");
        aluno4.nota = Float.parseFloat(JOptionPane.showInputDialog("Por favor, escreva a nota do aluno"));
        JOptionPane.showMessageDialog(null,aluno4);

        Aluno aluno1 = new Aluno("Romulo", 7.8F);
        System.out.println(aluno1);
        System.out.println("##############################");

        Aluno aluno2 = new Aluno("Priscila", 8.8F);
        System.out.println(aluno2);
        System.out.println("##############################");

        Aluno aluno3 = new Aluno("Abraão", 6.9F);
        System.out.println(aluno3);
        System.out.println("##############################");




    }
}
