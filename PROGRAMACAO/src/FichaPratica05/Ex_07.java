package FichaPratica05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myvec = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("array " + (i+1)+ ": ");
            myvec[i] = input.nextInt();

        }

        int cres = 0;
        for (int i = 0; i < 10; i++) {
            if (myvec[i]%2==0 && cres < myvec[i]) {
                cres = myvec[i];
            }
        }

        System.out.println("Maior num par: "+cres);
    }
}
