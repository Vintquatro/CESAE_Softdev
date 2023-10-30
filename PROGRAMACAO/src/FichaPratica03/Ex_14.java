package FichaPratica03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int fator, contador;


        System.out.println("fator: ");
        fator = input.nextInt();
        contador= fator;
        while (contador>1){

            fator=fator*(contador-1);
            System.out.println("valor: "+fator);
            contador--;
        }
        System.out.println("fatorial total: " + fator);
    }
}
