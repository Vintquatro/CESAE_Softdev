package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.SortedMap;
import static FichaPratica07.BibliotecaFicheiros.ImprimirFicheiros;

public class Ex_03 {

    public static void main(String[] args) throws FileNotFoundException {




/*

CAMINHO USUARIO
        //Inserir caminho na variavel

        String caminho3;
        System.out.println("Insira o caminho: ");
        caminho3=input.next();

        //Leitura do ficheiro com o caminho dado para a funcao chamada
        ImprimirFicheiros(caminho3);

*/

        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_01.txt"));
        String linha = null;
        while (ficheiro.hasNextLine()) {
            linha = ficheiro.nextLine();
            System.out.println(linha);
        }

        File novoFicheiro = new File("Ficheiros/exercicio_03_Criacao.txt");
        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);
        escritaFicheiro.println(linha);
        escritaFicheiro.close();




        // PRIMEIRO- INSTANCIAR DOCS | SEGUNDO CRIAR FUNCAO PARA OS DOCS
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    }
}
