package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex_03 {

    public static int calcularAreaRec(int lado1, int lado2){
        lado1=lado1*lado2;
        return lado1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int lado1,lado2;

        System.out.println("Lado 1: ");
        lado1= input.nextInt();
        System.out.println("Lado 2: ");
        lado2= input.nextInt();


        System.out.println("A area do so rectangulo é "+calcularAreaRec(lado1,lado2)+" Metros quatrados");
    }

}
