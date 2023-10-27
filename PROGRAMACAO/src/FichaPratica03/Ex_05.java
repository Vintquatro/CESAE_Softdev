package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, numi;

        System.out.println("num: ");
        num = input.nextInt();
        System.out.println("num2: ");
        numi = input.nextInt();

        while (num >= 0 && num <= numi) {


            System.out.println(num);
            num++;
        }
    }
}
