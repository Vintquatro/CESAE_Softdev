package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int[] myvec = new int[10];


        //int numAleatorio= new Random().nextInt(0,100);
        //System.out.println(numAleatorio);

        for (int i=0;i<10;i++){

            myvec[i]= input.nextInt();

        }

        int cres=myvec[1];
        for (int i=0;i<10;i++){
            if (cres<myvec[i]){
                cres=myvec[i];
            }

        }

        System.out.println("numero menor: "+nummenor);
}
