package Controllers;

import Domain.Entidades.Heroi;
import Domain.Entidades.NPC;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.Consumiveis.Pocao;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HeroiController {

    private ArrayList<NPC> npc;

    /**
     * Metodo Usar poção quem o Heroi tem no inventario
     * @param heroi
     */
    public void usarPocao(Heroi heroi) {
        Scanner input = new Scanner(System.in);
        int sair = 0;
        int contadorArray = 0;
        int contadorVitrine = 0;
        int opcaoItem;
        int contadorPocoes=0;
        ArrayList<Integer> vitrine = new ArrayList<>();

        if (heroi.getInventario().size() > 0) {

            for (Consumivel consumivelAtual : heroi.getInventario()) {
                contadorArray++;

                if (consumivelAtual instanceof Pocao) {
                    Pocao consumivelPocao = (Pocao) consumivelAtual;
                    contadorVitrine++;
                    contadorPocoes++;

                    vitrine.add(heroi.getInventario().indexOf(consumivelPocao));

                    System.out.println("Opcao: " + contadorVitrine);
                    System.out.println("");
                    consumivelPocao.ExibirDetalhesIH();
                }
            }

            if (contadorPocoes != 0){


                System.out.println("");
                System.out.println("1. Mamar uma Poção | 2. Bazar");
                System.out.println("Insere o numero da opcao:");


                sair = input.nextInt();

                if (sair == 2) {
                    return;
                }

                System.out.println("Que poção vais tomar?:");
                opcaoItem = input.nextInt();


                if (opcaoItem != contadorVitrine) {
                    do {
                        System.out.println("Mete a opcao correta pah...");
                        opcaoItem = input.nextInt();
                    } while (opcaoItem != contadorVitrine);
                }

                Pocao pocao = (Pocao) heroi.getInventario().get(vitrine.get(opcaoItem - 1));

                System.out.println("Vida atual: "+heroi.getHP());
                System.out.println("Força Atual: "+heroi.getPower());

                System.out.println();

                if (heroi.getMaxHP() < (heroi.getHP() + pocao.getHeal())) {

                    heroi.setHP(heroi.getMaxHP());
                } else {
                    heroi.setHP(heroi.getHP() + pocao.getHeal());
                }

                heroi.setPower(heroi.getPower() + pocao.getPowerUP());

                heroi.getInventario().remove(pocao);
                usarPocao(heroi);

            }else {
                System.out.println("Não tens poçoes!");
            }


            }else {
            System.out.println("Não tens poçoes!");
        }

        }

    /**
     * Metodo que genera aletoriamente um numero de 1 a 6
     * @return integer
     */
    public int lancarDados(){
        int dados= new Random().nextInt(1,6);
        return dados;
    }



}
