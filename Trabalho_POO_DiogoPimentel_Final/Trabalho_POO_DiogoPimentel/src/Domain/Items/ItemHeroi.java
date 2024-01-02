package Domain.Items;

import java.util.ArrayList;

public abstract class ItemHeroi {

    protected String nome;
    protected int preco;
    protected ArrayList<String> heroisPermitidos;

    /**
     * Construtor de um item heroi
     * @param nome
     * @param preco
     */
    public ItemHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<String>();
    }

    /** Metodo para exibir detalhes dos Items do Heroi
     *
     */
    public void ExibirDetalhesIH(){
        System.out.println(this.nome +" | Preco: "+this.preco+" Paus | "+this.heroisPermitidos);
    }

    /**
     * Metodo para adicionar uma classe de heroi
     * @param classeHeroi
     */
    public void addHeroipermitido(String classeHeroi){

        heroisPermitidos.add(classeHeroi);
    }


    public int getPreco() {
        return preco;
    }


    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }

    public String getNome() {
        return nome;
    }


}
