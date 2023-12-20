package View;

import java.util.Scanner;

public class Jogo {

    public static void menuCriacaoPersonagem(){

        String nome;

        Scanner input = new Scanner(System.in);

        System.out.println("GTA 6");

        System.out.println("Nova personagem");
        System.out.println("Indique o nome da Personagem: ");
        nome = input.nextLine();

        System.out.println("Bem vindo a L.A "+nome);



    }

}
