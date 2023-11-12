package FichaPratica05;

import java.util.Random;

public class Ex_12 {
    public static void main(String[] args) {

        int[] myvec1 = new int[10];
        int[] myvec2 = new int[10];
        int[][] mymat = new int[2][10];


        for (int i = 0; i < 10; i++) {
            myvec1[i] = new Random().nextInt(0, 100);
            System.out.println(myvec1[i]);

            myvec2[i] = new Random().nextInt(0, 100);
            System.out.println(myvec2[i]);

        }

        //coluna 0 x10 linhas
        for (int i = 0; i < 1; i++) {
            for (int v = 0; v < 10; v++) {
                mymat[i][v] = myvec1[v];
            }
        }
        //coluna 1 x10 linhas
        for (int i = 1; i < 2; i++) {
            for (int v = 0; v < 10; v++) {
                mymat[i][v] = myvec2[v];
            }
        }

        System.out.println(" ");
        //imprime
            for (int v = 0; v < 10; v++) {
                System.out.println(mymat[0][v]+" "+mymat[1][v]);
            }

        }
    }