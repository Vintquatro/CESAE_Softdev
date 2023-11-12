package FichaPratica06;

import java.util.Random;

public class Ex_08 {
    static void somarMatrizes(int[][] matriz1, int[][] matriz2) {

        for (int i=0; i < 3; i++) {
            for (int v=0; v < 3; v++) {
                System.out.println("Matriz 1: " + matriz1[i][v] + "| Matriz 2: " + matriz2[i][v]);
                matriz1[i][v]=matriz1[i][v]+matriz2[i][v];
                System.out.println("Soma Matriz: "+matriz1[i][v]);
            }
        }
    }

    static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {


        int somatotal=0;
        for (int i=0; i < 3; i++) {
            for (int v=0; v < 3; v++) {
                somatotal=somatotal+ matriz1[i][v]+matriz2[i][v];

            }}

        return somatotal;
    }


    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;


        for (int i=0; i < 3; i++) {
            for (int v=0; v < 3; v++) {

                matriz1[i][v] = new Random().nextInt(0, 100);
                matriz2[i][v] = new Random().nextInt(0, 100);
            }
        }

        // Inicializar matriz
        somarMatrizes(matriz1, matriz2);
        System.out.println(somatorioMatrizes(matriz1, matriz2));


    }

}

