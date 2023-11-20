package Ex_09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Mortalhas", 0.5);
/*
        Scanner input = new Scanner(System.in);
        String opcao;
        int quanti=0;

        System.out.println("Insira V para Venda e C para compra:");
        opcao = input.next();
        switch (opcao){

            case "C":
                System.out.println("Insira que quantidade quer comprar:");
                quanti=input.nextInt();
                break;
            case "V":
                System.out.println("Insira que quantidade quer comprar");
                quanti=input.nextInt();
                break;
            default:
                System.out.println("OPCAO INVALIDA");
        }*/


        produto1.compra(5);
        produto1.venda(2);
        System.out.println("Quantidade ONLINE: "+produto1.getQuantidade());
        produto1.compra(10);
        produto1.venda(35);



    }
}
