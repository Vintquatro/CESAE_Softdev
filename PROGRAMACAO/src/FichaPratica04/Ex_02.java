package FichaPratica04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int opcao;
        System.out.println("Introduza uma opcao:");
    opcao = input.nextInt();

    boolean repetir=true;
    while (repetir){
        switch (opcao){
            case 1:
                System.out.println("1.CRIAR");
                System.out.println("Introduza uma nova opcao");
                opcao = input.nextInt();
                break;
            case 2:
                System.out.println("2.ATUALIZAR");
                System.out.println("Introduza uma nova opcao");
                opcao = input.nextInt();

                break;
            case 3:
                System.out.println("3.ELIMINAR");
                System.out.println("Introduza uma nova opcao");
                opcao = input.nextInt();
                break;
            case 4:
                System.out.println("OBRIGADO POR USAR O SISTEMA DE TABELAS");
                repetir=false;
                break;
            default:
                System.out.println("ERRO!!!");
                System.out.println("Introduza uma nova opcao");
                opcao = input.nextInt();
                break;
        }

    }
    }
}
