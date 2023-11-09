package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex_04 {


    public static void tabuada(int x){

        for (int i=1;i<=10;i++){
            System.out.println(x+" X "+i+" = "+(x*i));
        }
        return;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        System.out.println("Numero da tabuada: ");
        x=input.nextInt();

        System.out.println("Tabuada do "+x);
        tabuada(x);

    }
}
