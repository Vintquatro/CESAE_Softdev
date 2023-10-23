package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        // Ler num1
        System.out.print("Insira um número: ");
        num1= input.nextInt();

        // Ler num2
        System.out.print("Insira um número: ");
        num2 = input.nextInt();

       //soma = num1+num2;

        System.out.println("Soma: " + (num1+num2));
        System.out.println("Subtracao: " + (num1-num2));
        System.out.println("multiplicacao: " + (num1*num2));
        System.out.println("divisao: " + (num1/num2));
    }
}
