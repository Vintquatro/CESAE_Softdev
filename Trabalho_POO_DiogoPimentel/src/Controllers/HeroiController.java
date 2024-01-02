package Controllers;

import Domain.Entidades.Heroi;
import Domain.Entidades.NPC;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.Consumiveis.ConsumivelCombate;
import Domain.Items.Consumiveis.Pocao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HeroiController {

    private ArrayList<NPC> npc;

    public HeroiController() {

    }

    public static int lancarDados(){

        int dados= new Random().nextInt(1,6);
        return dados;
    }


    public void usarPocao(Heroi heroi) {
        Scanner input = new Scanner(System.in);
        int sair = 0;


            int contadorArray = 0;
            int contadorVitrine = 0;
            int opcaoItem;
            ArrayList<Integer> vitrine = new ArrayList<>();

            if (heroi.getInventario().size() > 0) {

                for (Consumivel consumivelAtual : heroi.getInventario()) {
                    contadorArray++;

                    if (consumivelAtual instanceof Pocao) {
                        Pocao consumivelPocao = (Pocao) consumivelAtual;
                        contadorVitrine++;

                        vitrine.add(heroi.getInventario().indexOf(consumivelPocao));

                        System.out.println("Opcao: " + contadorVitrine);
                        System.out.println("");
                        consumivelPocao.ExibirDetalhesIH();
                    }
                }
                System.out.println("");
                System.out.println("Vais usar que Pocao bro?");
                System.out.println("Insere o numero da opcao:");
                System.out.println("Ou escolhe 0 para voltares atrás!");

                opcaoItem = input.nextInt();

                if (opcaoItem == 0) {
                    return;
                }

                if (opcaoItem != contadorVitrine) {
                    do {
                        System.out.println("Mete a opcao correta pah...");
                        opcaoItem = input.nextInt();
                    } while (opcaoItem != contadorVitrine);
                }

                Pocao pocao = (Pocao) heroi.getInventario().get(vitrine.get(opcaoItem-1));


                if (heroi.getMaxHP()< (heroi.getHP()+ pocao.getHeal())){

                    heroi.setHP(heroi.getMaxHP());
                }else {

                    heroi.setHP(heroi.getHP() + pocao.getHeal());
                }

               heroi.setPower(heroi.getPower()+pocao.getPowerUP());

            }

    }
}
