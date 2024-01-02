package Domain.Items.Consumiveis;

import java.util.ArrayList;

public class Pocao extends Consumivel{
    private int powerUP;
    private int heal;

    /**
     * Construtor de uma pocao
     * @param nome
     * @param preco
     * @param powerUP
     * @param heal
     */
    public Pocao(String nome, int preco, int powerUP, int heal) {
        super(nome, preco);
        this.powerUP = powerUP;
        this.heal = heal;
    }


    /**
     * Metodo com override da class pai item heroi
     * exibe os detalhes de uma pocao
     */

    @Override
    public void ExibirDetalhesIH() {
        System.out.println("*** Pocao ***");
        super.ExibirDetalhesIH();
        System.out.println("Aumenta: "+this.powerUP+" | Cura: "+this.heal);
        System.out.println("-------------------------");

    }

    public int getPowerUP() {
        return powerUP;
    }

    public int getHeal() {
        return heal;
    }

    public void setPowerUP(int powerUP) {

        this.powerUP = powerUP;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }


}
