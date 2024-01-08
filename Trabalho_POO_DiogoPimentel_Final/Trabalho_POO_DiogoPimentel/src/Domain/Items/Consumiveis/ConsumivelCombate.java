package Domain.Items.Consumiveis;

import java.util.ArrayList;

public class ConsumivelCombate extends Consumivel{
    private int ataqueInstantaneo;

    /**
     * Construtor Consumivel Combate
     * @param nome
     * @param preco
     * @param ataqueInstantaneo
     */
    public ConsumivelCombate(String nome, int preco, int ataqueInstantaneo) {
        super(nome, preco);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    /**
     * Metodo com override da class pai item heroi
     * exibe os detalhes de um consumivel combate
     */
    @Override
    public void ExibirDetalhesIH() {
        System.out.println("*** Consumivel Combate ***");
        super.ExibirDetalhesIH();
        System.out.println("Dano: "+this.ataqueInstantaneo);
        System.out.println("-------------------------");

    }

    public int getAtaqueInstantaneo() {
        return ataqueInstantaneo;
    }
}
