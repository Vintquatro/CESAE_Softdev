package FichaExtraFuncoes;

import java.util.Scanner;

public class Ex_05 {

    static String contarPiada(int piada){

        String[] bibliotecaPiadas = new String[4];

        bibliotecaPiadas[0]="Que nome se dá a uma ferramenta perdida? Foice";
        bibliotecaPiadas[1]="O que 17 alentejanos fazem em frente ao cinema? À espera que chege mais um porque o filme é para mais de 18.";
        bibliotecaPiadas[2]="Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3]="O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";

            return (bibliotecaPiadas[piada - 1]);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numPiada;
        System.out.print("Introduza um número para ouvir uma piada: ");
        numPiada = input.nextInt();

        if (numPiada<=4&&numPiada>=0) {
        }else {
            System.out.print("Introduza um número para ouvir uma piada: ");
            numPiada = input.nextInt();
        }

        System.out.print(contarPiada(numPiada));
    }
}
