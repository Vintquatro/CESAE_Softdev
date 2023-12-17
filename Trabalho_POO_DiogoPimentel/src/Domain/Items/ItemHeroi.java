package Domain.Items;

import java.util.ArrayList;

public abstract class ItemHeroi {

    protected String nome;
    protected int preco;
    protected ArrayList<String> heroisPermitidos;

    public ItemHeroi(String nome, int preco, ArrayList<String> heroisPermitidos) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = heroisPermitidos;
    }

    /** Metodo para exibir detalhes dos Items do Heroi
     *
     */
    public void ExibirDetalhes(){
        System.out.println("");
    }
}
