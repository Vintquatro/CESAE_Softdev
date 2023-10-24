package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String operacao;
        double n1,n2;

        System.out.println("n1: ");
        n1 = input.nextDouble();
        System.out.println("n2: ");
        n2 = input.nextDouble();
        System.out.println("operacao: ");
        operacao=input.next();


        switch (operacao){
            case "+": System.out.println(n1+n2);
            break;
            case "-": System.out.println(n1-n2);
            break;
            case "*": System.out.println(n1*n2);
            break;
            case "/": System.out.println(n1/n2);
            break;
            default: System.out.println("Erro!!!");
        }
    }
}
