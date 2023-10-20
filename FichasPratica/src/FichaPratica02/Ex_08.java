package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double n1, n2, n3,media;

        System.out.println("nota1: ");
        n1 = input.nextInt();
        System.out.println("nota2: ");
        n2 = input.nextInt();
        System.out.println("nota3: ");
        n3 = input.nextInt();

        media= (n1*0.25) + (n2*0.35) + (n3*0.40);
        System.out.println("media: "+ media);

        if (media > 9.5){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}
