package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int counter=1, num,ordem,ordem2=0;
        boolean crescente=true;

        System.out.println("num1: ");
        num = input.nextInt(); //7

        System.out.println("Numero: ");
        ordem= input.nextInt();

        while (counter<=num){
            System.out.println("Numero: ");
            ordem2= input.nextInt();

            System.out.println("Vou comparar: "+ordem+" >= "+ordem2);
            if (ordem>=ordem2){
                System.out.println("Atencao, sequencia nao crescente para sempre");
               crescente=false;
            }

            ordem=ordem2;
            counter++;
        }

        if(crescente){
            System.out.println("Crescente");
        }else {
            System.out.println("Nao crescente");
        }
    }
}
