package FichaPratica05;

import java.util.Random;

public class Ex_11 {

    public static void main(String[] args) {

        int[][] myvec = new int[3][3];
        int comparadorM=0, comparadorMenor=0;

        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                System.out.println("matrix " + (i) + " " + (v));
                myvec[i][v] = new Random().nextInt(0, 100);
                System.out.println("input aleatorio: " + myvec[i][v]);
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                System.out.print(myvec[i][v]+"\t");
            }
            System.out.println();
        }


        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                if (comparadorM<myvec[i][v]){
                    comparadorM=myvec[i][v];
                }
            }

        }
        comparadorMenor=myvec[0][0];
        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                if (comparadorMenor>myvec[i][v]){
                    comparadorMenor=myvec[i][v];
                }
            }
        }

        System.out.println("Numero maior: "+comparadorM+" Numero menor: "+comparadorMenor);

    }
}
