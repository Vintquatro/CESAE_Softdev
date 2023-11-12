package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myvec = new int[10];
        boolean cond = true;


        //int numAleatorio= new Random().nextInt(0,100);
        //System.out.println(numAleatorio);

        for (int i = 0; i < 10; i++) {
            System.out.println("array " + i + ": ");
            myvec[i] = input.nextInt();

        }

        int cres = 0;
        for (int i = 0; i < 10; i++) {
            if (cres < myvec[i]) {
                cres = myvec[i];

            } else {
                cond = false;
            }

        }

        if (cond == true) {
            System.out.println("é crescente");
        } else {
            System.out.println("Não é creceste");
        }
    }
}
