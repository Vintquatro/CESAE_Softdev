package FichaPratica06;

import java.util.Scanner;

public class Ex_05_06 {

    public static int maior(int[] vector) {


        int comparador = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > comparador) {
                comparador = vector[i];
            }
        }
        return comparador;
    }

    public static int menor(int[] vector) {


        int comparador = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < comparador) {
                comparador = vector[i];
            }
        }
        return comparador;
    }


    public static boolean crescente(int[] vector) {

        int cres = vector[0];
        boolean resultado=true;


        for (int i = 0; i < vector.length; i++) {
            if (cres < vector[i]) {
                cres = vector[i];
                resultado=true;
            } else {
                resultado=false;
            }
        }
        return resultado;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho do vetor: ");
        int tamanhoVec = input.nextInt();


        int menu;
        int vector[] = new int[tamanhoVec];
        int num;


        for (int i = 0; i < tamanhoVec; i++) {

            System.out.println("Valor que quer dar ao vector na posicao " + i);
            num = input.nextInt();
            vector[i] = num;
        }


        System.out.println("7. Maior Elemento: ");
        System.out.println("8. Menor Elemento: ");
        System.out.println("9. Crescente Ou Não Cresceste: ");

        menu = input.nextInt();

        switch (menu) {

            case 7:
                System.out.println(maior(vector));
                break;
            case 8:
                System.out.println(menor(vector));
                break;
            case 9:
                crescente(vector);
                if (crescente(vector)==true){
                    System.out.println("é crescente");
                }else {
                    System.out.println("Não é crescente");
                }
                break;
            default:
                System.out.println("Opcao nao valida");
        }
    }
}

