package Ex_09;

import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }




    public void venda (int quantidade){

        if ((this.quantidade-quantidade)<0){
            System.out.println("Nao é possivel realizar a venda, SEM STOCK");
            System.out.println("Stock Total: "+this.quantidade);
        }else {
            this.quantidade-=quantidade;
            System.out.println("Compra efetuada com sucesso!");
            System.out.println("Stock Total: "+this.quantidade);
        }
    }


    public void compra(int quantidade){
        this.quantidade+=quantidade;
        System.out.println("Stock Total: "+this.quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }
}
