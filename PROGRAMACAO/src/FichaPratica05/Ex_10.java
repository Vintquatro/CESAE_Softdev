package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int[][] myvec = new int[3][5];
        int numiguais,contador=0;

        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 5; v++) {
                System.out.println("matrix " + (i) + " " + (v));
                myvec[i][v] = new Random().nextInt(0, 100);
                System.out.println("input aleatorio: " + myvec[i][v]);
            }
        }

        System.out.println("Insira o numero a procurar: ");
        numiguais=input.nextInt();


        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 5; v++) {
                if (numiguais==myvec[i][v]){
                    contador++;
                }
            }
        }

        System.out.println("Tem "+contador+" numeros iguais");

    }
}
