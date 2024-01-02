package Domain.Items;

import java.util.ArrayList;

public abstract class ItemHeroi {

    protected String nome;
    protected int preco;
    protected ArrayList<String> heroisPermitidos;

    public ItemHeroi(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.heroisPermitidos = new ArrayList<String>();
    }

    /** Metodo para exibir detalhes dos Items do Heroi
     *
     */
    public void ExibirDetalhesIH(){
        System.out.println(this.nome);
        System.out.println("Preco: "+this.preco+" Paus");
        System.out.println(this.heroisPermitidos);

    }

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
