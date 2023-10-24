package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, mins, relog;

        System.out.println("Insira Horas:");
        horas = input.nextInt();

        System.out.println("Insira Mins:");
        mins = input.nextInt();

        if (horas > 12) {
            relog = horas - 12;

            System.out.println("Horas: "+ relog +":"+ mins + "PM");
        } else {
            System.out.println("Horas: " + horas + ":" + mins + "AM");
        }
    }
}