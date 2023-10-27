package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, numneg,numpos, num2;

        System.out.println("num: ");
        num = input.nextInt();
        num2=num;
        numneg=num-5;
        numpos=num+5;

        //neg
        while (numneg<num) {

            System.out.println(numneg);
            numneg++;

        }

        //pos
        while (num2<numpos) {
            num2++;
            System.out.println(num2);

        }

    }
}
