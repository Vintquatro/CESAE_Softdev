package FichaExtraArrays;

import java.util.Random;
import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int[] myArray = new int[14];
        int num,count=0;
        String ArrayPos="";

        for (int i=0;i<10;i++){
            myArray[i]= new Random().nextInt(0, 100);
            System.out.println("array: "+myArray[i]);
        }

        System.out.println("Num a pesquisar: ");
        num= input.nextInt();

       /* for (int i=0;i<10;i++) {
            if (num == myArray[i]) {
                cond = true;
                System.out.println(num + " Existe no Array!");
            }
        }*/

        for (int i=0;i<10;i++){
            if (num!=myArray[i]) {
                count++;
            }else {
                ArrayPos+=" "+i+" ";
            }
        }

        if (count!=10){
            System.out.println(num+" Existe no Array!");
            System.out.println("Posicao do(s) Array(s)"+ArrayPos);
        }else {
            System.out.println(num+" Não existe no Array!");
        }



    }

}
