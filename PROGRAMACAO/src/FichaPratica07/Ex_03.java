package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.SortedMap;
import static FichaPratica07.BibliotecaFicheiros.ImprimirFicheiros;

public class Ex_03 {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_03_alternativa01.txt"));
        String linha = null;
        File novoFicheiro = new File("Ficheiros/exercicio_03_Criacao.txt");
        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);


        while (ficheiro.hasNext()){
            linha = ficheiro.nextLine();
            escritaFicheiro.println(linha);
        }

        escritaFicheiro.close();



    }
}
