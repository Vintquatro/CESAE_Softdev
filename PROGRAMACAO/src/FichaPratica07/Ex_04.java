package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_04.csv"));

        while (ficheiro.hasNextLine()) {
            System.out.println(ficheiro.nextLine());
        }

    }
}
