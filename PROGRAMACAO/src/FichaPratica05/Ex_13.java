package FichaPratica05;

import java.util.Random;

public class Ex_13 {
    public static void main(String[] args) {

        int[][] myvec = new int[4][4];
        int soma=0, conta=0;

        for (int i = 0; i < 4; i++) {
            for (int v = 0; v < 4; v++) {
                myvec[i][v] = new Random().nextInt(0, 100);
                System.out.print(myvec[i][v]+"\t");
            }
            System.out.println();
        }

        while (conta<4){
            soma+=myvec[conta][conta];
            conta++;
        }

        System.out.println("Resultado Diagonal: "+soma);
    }
}
