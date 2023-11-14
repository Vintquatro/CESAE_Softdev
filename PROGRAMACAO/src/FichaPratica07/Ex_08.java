package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_08.txt"));
        File novoFicheiro = new File("Ficheiros/exercicio_08_Criacao.txt");
        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);

        String[] itemLinha;
        String linha, search;
        System.out.println("Introduza a palavra a procurar: ");
        search=input.next();
        int contador=0;


        while (ficheiro.hasNextLine()){
            linha = ficheiro.nextLine();
            itemLinha=linha.split(" ");
            for (int i=0;i<itemLinha.length;i++){
                if (search.equals(itemLinha[i]) || (search+",").equals(itemLinha[i])){
                    contador++;
                }

            if ((i == itemLinha.length-1) && (contador >= 1)){
                for (i=0;i<itemLinha.length;i++) {
                    escritaFicheiro.print(itemLinha[i]+" ");
                }
                escritaFicheiro.println("");
                }
            }
            contador=0;
            }
            escritaFicheiro.close();
            }

        }