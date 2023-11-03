package FichaPratica05;

import java.util.Random;

public class Ex_04 {

    public static void main(String[] args) {

            int[] myvec = new int[10];


            //int numAleatorio= new Random().nextInt(0,100);
            //System.out.println(numAleatorio);

            for (int i=0;i<10;i++){
                myvec[i]=new Random().nextInt(0,100);
                System.out.println(myvec[i]);
            }

            int nummenor=myvec[1];
            for (int i=0;i<10;i++){
                if (nummenor>myvec[i]){
                    nummenor=myvec[i];
                }

            }

            System.out.println("numero menor: "+nummenor);
    }
}
