package FichaPratica06;

import java.util.Scanner;

public class Ex_05 {


       /* Scanner input = new Scanner(System.in);
        System.out.println("Tamanho do vetor: ");
        int tamanhoVec = input.nextInt();

        vector[] */


    public static  int maior (int[] vector){


        int comparador=vector[0];
        for (int i=0;i<vector.length;i++){
            if (vector[i]>comparador){
                comparador=vector[i];
            }
            return vector[i];
        }
    }

    public static  int menor (int[] vector){


        int comparador=vector[0];
        for (int i=0;i<vector.length;i++){
            if (vector[i]<comparador){
                comparador=vector[i];
            }
            return vector[i];
        }
    }









    public static void main(String[] args) {

    }
}
