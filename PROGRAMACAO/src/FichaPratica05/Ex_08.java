package FichaPratica05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] myvec = new int[3][3];


        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                System.out.println("matrix " + (i)+" "+(v)+ ": ");
                myvec[i][v] = input.nextInt();
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                System.out.print(myvec[i][v]+"\t");
            }
            System.out.println();
        }





    }
}
