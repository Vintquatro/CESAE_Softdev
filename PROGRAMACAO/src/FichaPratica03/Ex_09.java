package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num=2, numi;

        System.out.println("num: ");
        numi = input.nextInt();


        while (num >=2 && num<=numi){

            if (num % 2 == 0){

                System.out.println(num);
            }
            num++;
        }
    }
}
