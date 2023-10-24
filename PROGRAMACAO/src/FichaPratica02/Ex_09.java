package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("num1:");
        n1 = input.nextInt();

        System.out.println("num2:");
        n2 = input.nextInt();

        System.out.println("num3:");
        n3 = input.nextInt();


        if (n1<n2) {
            if(n1<n3){
                System.out.println(n1 + " é o numero menor ");
            } else if (n3<n2) {
                System.out.println(n3 + " é o numero menor ");
            }
        }

        if (n2<n1) {
            if(n2<n3){
                System.out.println(n2 + " é o numero menor ");
            } else if (n3<n2) {
                System.out.println(n3 + " é o numero menor ");
            }
        }


    }

}
