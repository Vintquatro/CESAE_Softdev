package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado1, lado2;

        System.out.print("Insira a area do lado 1: ");
        lado1= input.nextInt();

        System.out.print("Insira a area do lado 2: ");
        lado2= input.nextInt();

        System.out.println("Area:" + (lado1 * lado2));
    }
}
