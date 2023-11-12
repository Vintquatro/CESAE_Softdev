package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex_01 {

    static int numeroMaisPequeno(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            return num1;
        }
        if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3, menor;



        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num2 = input.nextInt();
        System.out.print("Introduza um numero: ");
        num3 = input.nextInt();


        menor = numeroMaisPequeno (num1, num2, num3);
        System.out.print("Menor: " + menor);

    }
}
