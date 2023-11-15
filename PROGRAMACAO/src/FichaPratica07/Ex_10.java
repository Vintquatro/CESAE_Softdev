package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) throws FileNotFoundException {

        String[] itemLinha;
        String linha;
        double somatotal=0,quantidade,valor;

        Scanner input = new Scanner(System.in);
        Scanner ficheiro = new Scanner(new File("Ficheiros/exercicio_10.csv"));
        linha = ficheiro.nextLine();

        while (ficheiro.hasNextLine()){
            linha = ficheiro.nextLine();
            itemLinha=linha.split(",");
                quantidade=Double.parseDouble(itemLinha[2]);
                valor=Double.parseDouble(itemLinha[3]);
                somatotal+=(quantidade*valor);
        }
        System.out.println("SOMA TOTAL DE TODOS OS PRODUTOS: "+somatotal);





    }
}
