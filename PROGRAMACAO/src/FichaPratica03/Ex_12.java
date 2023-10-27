package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int num1,num2,counter;


        System.out.println("num1: ");
        num1 = input.nextInt();
        System.out.println("num2: ");
        num2 = input.nextInt();

        counter=num1;

        while (counter>=num1 && counter <=num2){
            if (counter%5==0){
                System.out.println("Multiplo: "+counter);
            }
            counter++;
        }
    }
}
