package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Quantia: ");

        int valor,numeroDeNotas;

        valor = input.nextInt();

        if (valor % 5 != 0) {
            System.out.println("Entrada inválida");
        } else {

            numeroDeNotas = valor / 200;
            if (numeroDeNotas > 0) {
                System.out.println("200 : " + numeroDeNotas);
                valor = valor % 200;
            }

            numeroDeNotas = valor / 100;
            if (numeroDeNotas > 0) {
                System.out.println("100 : " + numeroDeNotas);
                valor = valor % 100;
            }

            numeroDeNotas = valor / 50;
            if (numeroDeNotas > 0) {
                System.out.println("50 : " + numeroDeNotas);
                valor = valor % 50;
            }

            numeroDeNotas = valor / 20;
            if (numeroDeNotas > 0) {
                System.out.println("20 : " + numeroDeNotas);
                valor = valor % 20;
            }

            numeroDeNotas = valor / 10;
            if (numeroDeNotas > 0) {
                System.out.println("10 : " + numeroDeNotas);
                valor = valor % 10;
            }

            numeroDeNotas = valor / 5;
            if (numeroDeNotas > 0) {
                System.out.println("5 : " + numeroDeNotas);
            }
        }


    }
}
