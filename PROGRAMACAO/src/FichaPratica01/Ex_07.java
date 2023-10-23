package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double prod1, prod2, prod3;
        System.out.print("Preço do produto 1:");
        prod1=input.nextDouble();
        System.out.print("Preço do produto 2:");
        prod2=input.nextDouble();
        System.out.print("Preço do produto 3:");
        prod3=input.nextDouble();

        //System.out.println(prod1-(prod1*0.1));
        //System.out.println(prod2-(prod2*0.1));
        //System.out.println(prod3-(prod3*0.1));

        System.out.println((prod1+prod2+prod3)*0.9);



    }
}
