package FichaPratica06;

import java.util.Scanner;

public class Ex_07 {

        public static String quadradinho(String letra){

                Scanner input = new Scanner(System.in);
                int lin, col;

                System.out.println("Insira linhas:");
                lin=input.nextInt();
                System.out.println("Insira colunas:");
                col=input.nextInt();


                for (int i=0;i<lin;i++){
                        for (int v=0;v<col;v++){
                                if (i!=0 && v!=0 && i!=lin-1 && v!=col-1){
                                        System.out.print(" ");
                                }else {
                                        System.out.print(letra);
                                }
                        }
                        System.out.println("");
                }
                return letra;
        }

        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                String caracter;
                System.out.println("Introduza a sua letra");

                caracter=input.next();
                quadradinho(caracter);
        }
}
