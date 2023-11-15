package FichaPratica05;

import java.lang.Math;
import java.util.Random;

public class Ex_03 {
    public static void main(String[] args) {

        int[] myvec = new int[10];
        boolean encontrado = false;
        int elemento=10;

        //int numAleatorio= new Random().nextInt(0,100);
        //System.out.println(numAleatorio);

        for (int i=0;i<10;i++){
            myvec[i]=new Random().nextInt(0,100);
            System.out.println(myvec[i]);
        }

        for (int i=0;i<myvec.length;i++){
            if (myvec[i]==elemento){
                encontrado= true;
            }
        }

        if (encontrado){
            System.out.println("SIM!!!!!!");
        }else{
            System.out.println("NAO!!!!");
        }

    }
}
