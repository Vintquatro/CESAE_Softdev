package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, numi;

        System.out.println("num: ");
        numi = input.nextInt();

        while (num >= 0 && num <= numi) {


            System.out.println(num);
            num++;
        }
    }
}
