package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14, raio;

        System.out.print("Insira o raio: ");
        raio= input.nextDouble();

        System.out.printf("Raio:" + (pi*(raio*raio)));

        System.out.println();
    }
}
