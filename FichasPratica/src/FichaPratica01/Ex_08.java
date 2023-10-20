package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seg,min,hora, duracao;

        System.out.print("Insira os segundos da musica 1:");
        seg=input.nextInt();
        System.out.print("Insira os mins da musica 1:");
        min=input.nextInt();

        duracao= seg + (min*60);

        System.out.print("Insira os segundos da musica 2:");
        seg=input.nextInt();
        System.out.print("Insira os mins da musica 2:");
        min=input.nextInt();

        duracao= duracao + seg +(min*60);


        System.out.print("Insira os segundos da musica 3:");
        seg=input.nextInt();
        System.out.print("Insira os mins da musica 3:");
        min=input.nextInt();

        duracao= duracao + seg +(min*60);


        hora=duracao/3600;
        min=(duracao%3600) /60;
        seg=(duracao%60)%60;


        System.out.println("A duracao do album é de:" + hora + "h " + min + "min " + seg + "seg ");



    }
}
