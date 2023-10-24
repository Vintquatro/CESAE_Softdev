package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n1, n2, n3;
        String ordem;

        System.out.println("C ou D?: ");
        ordem = input.next();

        System.out.println("Insira valores: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if (ordem.equals("c")) {
            if (n1 < n2) {
                if (n1 < n3) {
                    if (n3 < n2) {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    } else {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    }

                }
            }
            if (n2 < n3) {
                if (n3 < n1) {
                    System.out.println(n2 + " " + n3 + " " + n1);
                } else {
                    System.out.println(n2 + " " + n1 + " " + n3);
                }
            } else if (n3 < n1) {
                if (n2 < n1) {
                    System.out.println(n3 + " " + n2 + " " + n1);
                } else {
                    System.out.println(n3 + " " + n1 + " " + n2);
                }
            }

        } else if (ordem.equals("d")) {
            if (n1 > n2) {
                if (n1 > n3) {
                    if (n3 > n2) {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    } else {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    }

                }
            }
            if (n2 > n3) {
                if (n3 > n1) {
                    System.out.println(n2 + " " + n3 + " " + n1);
                } else {
                    System.out.println(n2 + " " + n1 + " " + n3);
                }
            } else if (n3 > n1) {
                if (n2 > n1) {
                    System.out.println(n3 + " " + n2 + " " + n1);
                } else {
                    System.out.println(n3 + " " + n1 + " " + n2);
                }

            }
        }


    }

}
