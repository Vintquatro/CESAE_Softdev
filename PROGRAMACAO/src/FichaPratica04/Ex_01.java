package FichaPratica04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int num1,num2;
        boolean repetir=true;
        String operador,continuar;


        while (repetir==true){


            System.out.println("num1: ");
            num1= input.nextInt();

            System.out.println("num2: ");
            num2= input.nextInt();

            System.out.println("Operador: ");
            operador= input.next();

            switch (operador){

                case "+":
                    System.out.println("Soma= "+(num1+num2));
                    break;
                case "-":
                    System.out.println("Subtracao= "+(num1-num2));
                    break;
                case "*":
                    System.out.println("Multiplcacao= "+(num1*num2));
                    break;
                case "/":
                    System.out.println("Divisao= "+(num1/num2));
                    break;
                default:
                    System.out.println("Erro!");
            }

            System.out.println("Deseja continuar?: ");
            continuar=input.next();

            if (continuar.equals("s")){
                repetir=true;
            }else {
                repetir=false;
            }
            System.out.println(repetir);
        }
    }
}
