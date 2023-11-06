package FichaPratica05;

import java.util.Random;

public class Ex_10_Comparacao {

    public static void main(String[] args) {

        int[][] myvec = new int[3][5];
        int numiguais = 0;

        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 5; v++) {
                System.out.println("matrix " + (i) + " " + (v));
                myvec[i][v] = new Random().nextInt(0, 100);
                System.out.println("input aleatorio: " + myvec[i][v]);

                for (int a = 0; a < 3; a++) {
                    for (int b = 0; b < 5; b++) {
                        if (myvec[a][b] == myvec[i][v]) {
                            numiguais += 1;
                        }
                    }
                }
            }
        }
        System.out.println("Total nums iguais: "+numiguais);
    }
}
