package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Quantia: ");

        int val,numeroDeNotas;

        val = input.nextInt();

        if (val % 5 != 0) {
            System.out.println("Entrada inválida");
        } else {
            //550 val --- numero de notas = 2

            numeroDeNotas = val / 200;
            if (numeroDeNotas > 0) {
                System.out.println("200 : " + numeroDeNotas);
                val = val % 200; //val 150
            }

            numeroDeNotas = val / 100;
            if (numeroDeNotas > 0) {
                System.out.println("100 : " + numeroDeNotas);
                val = val % 100;
            }

            numeroDeNotas = val / 50;
            if (numeroDeNotas > 0) {
                System.out.println("50 : " + numeroDeNotas);
                val = val % 50;
            }

            numeroDeNotas = val / 20;
            if (numeroDeNotas > 0) {
                System.out.println("20 : " + numeroDeNotas);
                val = val % 20;
            }

            numeroDeNotas = val / 10;
            if (numeroDeNotas > 0) {
                System.out.println("10 : " + numeroDeNotas);
                val = val % 10;
            }

            numeroDeNotas = val / 5;
            if (numeroDeNotas > 0) {
                System.out.println("5 : " + numeroDeNotas);
            }
        }


    }
}
