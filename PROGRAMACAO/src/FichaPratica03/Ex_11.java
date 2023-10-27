package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int num,cond1=0, cond2=0, cond3=0,cond4=0;
        System.out.println("num: ");
        num = input.nextInt();

        while (num >=0){

         if (num>=0 && num<=25){
             cond1++;
            }
         if (num>=26 && num<=50){
                cond2++;
            }
         if (num>=51 && num<=75){
                cond3++;
            }
         if (num>=76 && num<=100){
                cond4++;
            }
            System.out.println("NovoNum: ");

         num =input.nextInt();

         }

        System.out.println("--Finalizado--");
        System.out.println("00,25: "+cond1);
        System.out.println("26,50: "+cond2);
        System.out.println("51,75: "+cond3);
        System.out.println("76,100: "+cond4);

    }
}
