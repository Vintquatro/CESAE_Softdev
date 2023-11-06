package FichaExtraArrays;

import java.util.Random;

public class Ex_05 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int num,count=0;
        int[] ArrayCounter = new int[10];

        for (int i=0;i<10;i++){
            myArray[i]= new Random().nextInt(0, 100);
            System.out.println("array: "+myArray[i]);
        }

        num=myArray[1];
        for (int i=0;i<10;i++){
            if (num==myArray[i]) {
                ArrayCounter[i]++;
                if (ArrayCounter[i]>1){
                    System.out.println("Este numero é duplicado "+myArray[i]);
                }
            }
        }
    }
}
