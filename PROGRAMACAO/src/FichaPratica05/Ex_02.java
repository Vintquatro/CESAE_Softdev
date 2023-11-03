package FichaPratica05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int total=0;
        int[] myvec = new int[12];

        for (int i=0; i<12;i++){
            System.out.println("Imprima o valor para o mes "+(i+1));
            myvec[i] =input.nextInt();
            total = total+ myvec[i];
        }
        System.out.println("Bonus Anual: "+(total/12));

    }
}
