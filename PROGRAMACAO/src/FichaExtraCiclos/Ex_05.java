package FichaExtraCiclos;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1,num2, menor,maior;

        System.out.println("num: ");
        num1= input.nextInt();
        num2=num1;


        if (num1==0){
            System.out.println("num diferente de 0: ");
            num1= input.nextInt();
        }

       do {
           //calculador maior
           if (num1>num2){
               maior=num1;
           }else {
               maior=num2;
           }


           //calculador menor
           if (num1<num2){
               menor=num1;
           }else {
               menor=num2;
           }

           System.out.println("Novo num: ");
           num1=input.nextInt();


       } while (num1!=0);

        System.out.println("Maior num: "+maior+" e o menor num: "+menor);

    }
}
