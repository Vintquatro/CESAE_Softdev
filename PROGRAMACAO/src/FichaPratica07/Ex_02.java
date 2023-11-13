package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void main(String[] args) throws FileNotFoundException {
        File novoFicheiro = new File("Ficheiros/exercicio_02.txt");

        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);

        String mensagem = "Vai toda a gente ficar bem empregado no final do curso!";

        escritaFicheiro.println(mensagem);


        escritaFicheiro.close();

    }
}
