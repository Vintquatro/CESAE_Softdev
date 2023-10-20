package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;

        System.out.println("num:");
        num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " é um numero par");

        } else {
            System.out.println(num1 + " é um numero impar");
        }
    }
}