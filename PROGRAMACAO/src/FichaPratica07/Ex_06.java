package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_06.txt"));
        int idade=0;
        String linha,nome="teste";
        String[] itemsLinha;

        while (ficheiro.hasNextLine()){
        linha = ficheiro.nextLine();
        itemsLinha=linha.split(",");


        if (idade<Integer.parseInt(itemsLinha[1])){
            idade=Integer.parseInt(itemsLinha[1]);
            nome=itemsLinha[0];
        }
        }
        System.out.println(nome);
    }
}
