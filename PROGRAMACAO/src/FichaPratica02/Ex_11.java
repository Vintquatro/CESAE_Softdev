package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo,mont,saldof;

        System.out.println("Introduza o saldo: ");
        saldo = input.nextDouble();
        System.out.println("Introduza o montante a depositar ou creditar: ");
        mont =  input.nextDouble();


        if (mont < 0){
            saldof = ((saldo) + (mont));


            if (saldof<0){
                System.out.println("Voce é pobre");
            }
            else {
                System.out.println("Saldo conta: " + saldof);
            }
        }

    }
}
