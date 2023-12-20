package Domain.Items;

import java.util.ArrayList;

public class ArmaPrincipal extends ItemHeroi{
    private int ataque;
    private int ataqueEspecial;


    public ArmaPrincipal(String nome, int preco, int ataque, int ataqueEspecial) {
        super(nome, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    @Override
    public void ExibirDetalhesIH() {
        System.out.print("***Arma principal***");
        System.out.println();
        super.ExibirDetalhesIH();
        System.out.println("-------------------------");

    }
}
