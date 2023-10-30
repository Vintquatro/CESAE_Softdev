package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int secret, guess,tentativas=0;

        System.out.println("Jogador 1: ");
        secret = input.nextInt();

        System.out.println("Jogador 2: ");
        guess=input.nextInt();

        do {
            if (guess<secret){
                System.out.println("O seu numero é inferior");
            }
            if (guess>secret){
                System.out.println("O seu numero é maior");
            }
            tentativas++;

            System.out.println("Tente Outra vez: ");
            guess=input.nextInt();

        }while (guess!=secret);

        if (guess==secret){
            System.out.println("PARABENS CAMPEAO!");
            System.out.println("Só precisaste de "+tentativas+" Tentativas!");
        }

    }
}
