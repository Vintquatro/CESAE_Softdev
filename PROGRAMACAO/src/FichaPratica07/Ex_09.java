package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_09.txt"));

        String[] itemLinha;
        String linha, search;

        System.out.println("Introduza a palavra a procurar: ");
        search=input.next();
        int contadorPalavras=0;

        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            itemLinha = linha.split(" ");
            for (int i = 0; i < itemLinha.length; i++) {

            }
        }



    }

}
