package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {

    public static void ImprimirFicheiros(String caminho) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File(caminho));
        String linha;
        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            System.out.println(linha);
        }
    }


    /*public static void EscrituraFicheiros(String caminho){

        Scanner input = new Scanner(System.in);
        File novoFicheiro = new File(caminho);

        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);

        texto = input.next();

        escritaFicheiro.println(mensagem);


        escritaFicheiro.close();

    }*/
}
