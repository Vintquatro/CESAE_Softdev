package Domain.Items.Consumiveis;

import java.util.ArrayList;

public class ConsumivelCombate extends Consumivel{
    private int ataqueInstantaneo;

    public ConsumivelCombate(String nome, int preco, int ataqueInstantaneo) {
        super(nome, preco);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    @Override
    public void ExibirDetalhesIH() {
        super.ExibirDetalhesIH();
        System.out.println("Dano: "+this.ataqueInstantaneo);
    }
}
