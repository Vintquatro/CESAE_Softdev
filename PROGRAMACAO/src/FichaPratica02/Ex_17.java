package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldoM, ValCred;

        saldoM = input.nextDouble();

        if (saldoM <= 2000) {
            System.out.println("Não é possível fornecer crédito");
        }
        if (saldoM > 2000 && saldoM <= 4000) {
            System.out.println("Crédito disponivel: (20%)  " + saldoM *0.20);
        }
        if (saldoM > 4000 && saldoM <= 6000) {
            System.out.println("Crédito disponivel: (30%)  " + saldoM *0.30);
        }
        if (saldoM > 6000) {
            System.out.println("Crédito disponivel: (40%)  " + saldoM *0.40);
        }
    }
}
