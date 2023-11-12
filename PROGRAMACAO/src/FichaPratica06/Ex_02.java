package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {

    public static int leitura(){

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num=input.nextInt();

        if (num<=0){
            System.out.println("Insira um numero valido");
            num=input.nextInt();
        }
        return num;
    }

    public static void asteriscos(int num){
        for (int i=0;i<num;i++){
            System.out.print("*");
        }
        return;
    }


    public static void main(String[] args) {


        asteriscos(leitura());

    }
}
