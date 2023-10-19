package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2,num3;


        System.out.print("Insira um número1: ");
        num1= input.nextInt();

        System.out.print("Insira um número2: ");
        num2= input.nextInt();

        System.out.print("Insira um número3: ");
        num3= input.nextInt();

        System.out.println("media:" + (num1+num2+num3)/3);
        System.out.println("media aritmetica:" + ((num1*0.2) + (num2*0.3) + (num3*0.5)));


    }
}
