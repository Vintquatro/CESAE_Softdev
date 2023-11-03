package FichaPratica05;

import java.util.Random;

public class Ex_05 {
    public static void main(String[] args) {


        int[] myvec = new int[10];
        double media=0;


        //int numAleatorio= new Random().nextInt(0,100);
        //System.out.println(numAleatorio);

        for (int i=0;i<10;i++){
            myvec[i]=new Random().nextInt(0,100);
            System.out.println(myvec[i]);
            media=media+myvec[i];
        }


        System.out.println("media: "+(media/10));

    }
}
