package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_05_1999.txt"));
        int soma=0;


        while (ficheiro.hasNextInt()) {
           soma+=ficheiro.nextInt();
        }

        System.out.println(soma);

    }
}
