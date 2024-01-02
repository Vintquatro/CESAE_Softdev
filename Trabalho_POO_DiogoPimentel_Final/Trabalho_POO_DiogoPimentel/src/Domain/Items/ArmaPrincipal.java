package Domain.Items;

import java.util.ArrayList;

public class ArmaPrincipal extends ItemHeroi{
    private int ataque;
    private int ataqueEspecial;

    /**
     * Construtor de uma Arma Principal
     * @param nome
     * @param preco
     * @param ataque
     * @param ataqueEspecial
     */
    public ArmaPrincipal(String nome, int preco, int ataque, int ataqueEspecial) {
        super(nome, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    /**
     * Metodo com override da class pai item heroi
     * exibe os detalhes de uma Arma Principal
     */
    @Override
    public void ExibirDetalhesIH() {
        System.out.print("***Arma principal***");
        System.out.println();
        super.ExibirDetalhesIH();
        System.out.println("Dano: "+this.ataque+" | Dano Especial: "+this.ataqueEspecial);
        System.out.println("-------------------------");

    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }



}
