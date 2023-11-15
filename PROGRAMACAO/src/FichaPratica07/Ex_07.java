package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File ("Ficheiros/exercicio_07.txt"));
        int i=0,palavras=0;
        String[] itemLinha;
        String linha;

        while (ficheiro.hasNextLine()){
            i++;
            linha = ficheiro.nextLine();
            itemLinha=linha.split(" ");
            palavras+=itemLinha.length;


        }

        System.out.println("Numero de Linhas: "+i+" e "+palavras+" palavras");


    }
}
