package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] myvec = new int[5][5];
        int soma=0;

        for (int i = 0; i < 5; i++) {
            for (int v = 0; v < 5; v++) {
                System.out.println("matrix " + (i)+" "+(v)+ ": ");
                myvec[i][v] = new Random().nextInt(0,100);
                System.out.println("input aleatorio: "+myvec[i][v]+" Soma ate agora: "+soma);
                soma+=myvec[i][v];
            }
        }
        System.out.println("Total da soma: "+soma);

    }
}
