package Controllers.Ataques;

import Domain.Entidades.Entidade;
import Domain.Entidades.Heroi;
import Domain.Entidades.NPC;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.Consumiveis.ConsumivelCombate;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Charisma implements EstrategiaAtaque {


    /**
     * Funcao para generar uma frase para um ataque do inimigo
     */
    public void fraseInimigoRandom(){
        ArrayList<String> frasesAtaque = new ArrayList<String>();
        int fraseRandom= new Random().nextInt(0,3);

        frasesAtaque.add(0, "Dasse... O gajo é bué rápido e já te está a mandar uma patada");
        frasesAtaque.add(1, "Manda te um peidito e abana a mão para o cheiro ir na tua direção");
        frasesAtaque.add(2, "'A tua mãe não sabe fazer arroz' diz o gaijo e sentes-te que aquilo te doeu mais que um murro");
        frasesAtaque.add(3, "O gajo faz um moon walk na tua direção e dá te uma chapada com o pé");

        System.out.println(frasesAtaque.get(fraseRandom));

    }

    /**
     * Funcao para generar uma frase para um ataque do Heroi
     */
    public void fraseHeroiRandom(){
        ArrayList<String> frasesAtaque = new ArrayList<String>();
        int fraseRandom= new Random().nextInt(0,5);

        frasesAtaque.add(0, "Insultas a mãe do gaijo");
        frasesAtaque.add(1, "Dás flex com a roupa que tens vestida e chamas o gaijo de Brokie boy");
        frasesAtaque.add(2, "Mandas ganda Arroto");
        frasesAtaque.add(3, "Gozas com o gaijo por ter comprado um curso de forex");
        frasesAtaque.add(4, "Perguntas se ele conhece o gajo que te deu aulas de Kung-Fu, o gaijo pergunta 'Quem?', e respondes 'O caralho!'");
        frasesAtaque.add(5, "Tiras uma selfie e envias para a prima do gaijo");



        System.out.println(frasesAtaque.get(fraseRandom));

    }




    @Override
    public Entidade ataquePai(NPC npc, Heroi heroi) {

        int ataqueEspecialContador = 0;
        int ataqueNPC = (int) npc.getPower();
        int opcao;
        int ouroDropado;
        Scanner input = new Scanner(System.in);
        int ouroRandom= new Random().nextInt(1,25);



        do {

            System.out.println(" _______________________");
            System.out.println("|----  MODO COMBATE ----|");
            System.out.println("|_______________________|");

            System.out.println("O gaijo tem "+npc.getHP()+" de vida!");
            System.out.println("");
            System.out.println("1. Ataque Normal");
            System.out.println("2. Ataque Especial");
            System.out.println("3. Consumivel de Ataque");

            opcao= input.nextInt();

            switch (opcao) {

                case 1:

                    //Verificao do Ataque do heroi e reducao da vida caso ataque
                    if (npc.getHP()>(heroi.getPower()+heroi.getArmaPrincipal().getAtaque())) {
                        fraseHeroiRandom();
                        System.out.println("Tiraste "+(heroi.getPower()+heroi.getArmaPrincipal().getAtaque())+" de vida ao gaijo!");
                        npc.setHP(npc.getHP()- (heroi.getPower()+heroi.getArmaPrincipal().getAtaque()));

                        if (heroi.getHP() > ataqueNPC) {
                            //Leva dano do NPC PRIMEIRO
                            fraseInimigoRandom();
                            System.out.println("Levas-te na boca");
                            heroi.setHP(heroi.getHP() - ataqueNPC);
                            System.out.println("Tens agora " + heroi.getHP() + "HP");

                        }else {
                            heroi.setHP(heroi.getHP() - ataqueNPC);
                            System.out.println("Foste de c*na!");
                            return npc;
                        }



                    }else {
                        npc.setHP(0);
                        System.out.println("Mataste o gaijo com "+heroi.getArmaPrincipal().getNome());

                        // GANHOS DE LUTA!
                        ouroDropado=ouroRandom;
                        heroi.setOuro(heroi.getOuro()+ouroDropado);

                        heroi.setNivel(heroi.getNivel()+1);
                        System.out.println("Subiste de nivel: "+heroi.getNivel());
                        System.out.println();
                        System.out.println("* Sentes-te grande patrão com a tua fight ganha *");
                        System.out.println("A tua confiança faz aumentar a tua vida e força");
                        heroi.setHP(heroi.getHP()+10);
                        heroi.setPower(heroi.getPower()+1);
                        System.out.println("Vida restaurada: +10HP | "+heroi.getHP()+"HP");
                        System.out.println("Força: +1");
                        System.out.println("");
                        System.out.println("Deste o mico ao gaijo e ganhaste: "+ouroDropado);
                        System.out.println("Tens agora: "+heroi.getOuro());

                        return heroi;
                    }

                    break;


                case 2:

                    if(ataqueEspecialContador != 0){
                        System.out.println("Meu menino, tu é que pareces especial! Já usaste este ataque!");
                    }else {

                        //Verificao do Ataque do heroi e reducao da vida caso ataque
                        if (npc.getHP() > (heroi.getPower()+heroi.getArmaPrincipal().getAtaqueEspecial())) {

                            fraseHeroiRandom();
                            System.out.println("Tiraste " + (heroi.getPower()+heroi.getArmaPrincipal().getAtaqueEspecial()) + " de vida ao gaijo");
                            npc.setHP(npc.getHP() - (heroi.getPower()+heroi.getArmaPrincipal().getAtaqueEspecial()));
                            ataqueEspecialContador = 1;

                            if (heroi.getHP() > ataqueNPC) {
                                //Leva dano do NPC PRIMEIRO
                                fraseInimigoRandom();
                                System.out.println("Levas-te na boca");
                                heroi.setHP(heroi.getHP() - ataqueNPC);
                                System.out.println("Tens agora " + heroi.getHP() + "HP");

                            }else {
                                heroi.setHP(heroi.getHP() - ataqueNPC);
                                System.out.println("Foste de c*na!");
                                return npc;
                            }


                        } else {
                            npc.setHP(npc.getHP() - heroi.getPower());
                            System.out.println("Mataste o gaijo com "+heroi.getArmaPrincipal().getNome());


                            ouroDropado=ouroRandom;
                            heroi.setOuro(heroi.getOuro()+ouroDropado);

                            heroi.setNivel(heroi.getNivel()+1);
                            System.out.println("Subiste de nivel: "+heroi.getNivel());
                            System.out.println();
                            System.out.println("* Sentes-te grande patrão com a tua fight ganha *");
                            System.out.println("A tua confiança faz aumentar a tua vida e força");
                            heroi.setHP(heroi.getHP()+10);
                            heroi.setPower(heroi.getPower()+1);
                            System.out.println("Vida restaurada: +10HP | "+heroi.getHP()+"HP");
                            System.out.println("Força: +1");
                            System.out.println("");
                            System.out.println("Deste o mico ao gaijo e ganhaste: "+ouroDropado);
                            System.out.println("Tens agora: "+heroi.getOuro());

                            return heroi;
                        }
                    }
                    break;


                case 3:

                    int contadorArray=0;
                    int contadorVitrine=0;
                    int opcaoItem;
                    ArrayList<Integer> vitrine = new ArrayList<>();

                    if (heroi.getInventario().size()>0){

                        for (Consumivel consumivelAtual:heroi.getInventario()) {
                            contadorArray++;

                            if (consumivelAtual instanceof ConsumivelCombate){
                                ConsumivelCombate consumivelCombateVar = (ConsumivelCombate) consumivelAtual;
                                contadorVitrine++;

                                vitrine.add(heroi.getInventario().indexOf(consumivelCombateVar));

                                System.out.println("Opcao: "+contadorVitrine);
                                System.out.println("");
                                consumivelCombateVar.ExibirDetalhesIH();
                            }
                        }

                        System.out.println("");
                        System.out.println("Vais usar qual bro?");
                        System.out.println("Insere o numero da opcao:");
                        System.out.println("Ou escolhe 0 para voltares atrás!");

                        opcaoItem = input.nextInt();

                        if (opcaoItem==0){
                            break;
                        }

                        if (opcaoItem!=contadorVitrine) {
                            do {
                                System.out.println("Mete a opcao correta pah...");
                                opcaoItem = input.nextInt();
                            } while (opcaoItem != contadorVitrine);
                        }

                        //*******************************************
                        //DESENVOLVIMENTO DO METODO ATAQUE CONSUMIVEL

                        //Dá o numero da vitrine para irmos buscar ao Array dos consumiveis
                        heroi.getInventario().get(vitrine.get(opcaoItem-1));

                        System.out.println();
                        System.out.println("Usaste a(s)/o(s):");
                        System.out.println(heroi.getInventario().get(vitrine.get(opcaoItem-1)).getNome());

                        ConsumivelCombate itemCombate = (ConsumivelCombate) heroi.getInventario().get(vitrine.get(opcaoItem-1));
                        System.out.println("Para mandar mandar um estouro de:");
                        itemCombate.getAtaqueInstantaneo();

                        System.out.println("-"+itemCombate.getAtaqueInstantaneo()+" HP");

                        //Verificao do Ataque do heroi e reducao da vida caso ataque
                        if (npc.getHP() > (itemCombate.getAtaqueInstantaneo())) {
                            System.out.println("Tiraste " + (itemCombate.getAtaqueInstantaneo()) + " de vida ao gaijo");
                            npc.setHP(npc.getHP() - (itemCombate.getAtaqueInstantaneo()));
                            heroi.getInventario().remove(heroi.getInventario().indexOf(itemCombate));

                            if (heroi.getHP() > ataqueNPC) {
                                //Leva dano do NPC PRIMEIRO
                                fraseInimigoRandom();
                                System.out.println("Levas-te na boca");
                                heroi.setHP(heroi.getHP() - ataqueNPC);
                                System.out.println("Tens agora " + heroi.getHP() + "HP");

                            }else {
                                heroi.setHP(heroi.getHP() - ataqueNPC);
                                System.out.println("Foste de c*na!");
                                return npc;
                            }

                        } else {
                            npc.setHP(npc.getHP() - itemCombate.getAtaqueInstantaneo());
                            System.out.println("Mataste o gaijo");
                            heroi.getInventario().remove(heroi.getInventario().indexOf(itemCombate));


                            ouroDropado=ouroRandom;
                            heroi.setOuro(heroi.getOuro()+ouroDropado);

                            heroi.setNivel(heroi.getNivel()+1);
                            System.out.println("Subiste de nivel: "+heroi.getNivel());
                            System.out.println();
                            System.out.println("* Sentes-te grande patrão com a tua fight ganha *");
                            System.out.println("A tua confiança faz aumentar a tua vida e força");
                            heroi.setHP(heroi.getHP()+10);
                            heroi.setPower(heroi.getPower()+1);
                            System.out.println("Vida restaurada: +10HP | "+heroi.getHP()+"HP");
                            System.out.println("Força: +1");
                            System.out.println("");
                            System.out.println("Deste o mico ao gaijo e ganhaste: "+ouroDropado);
                            System.out.println("Tens agora: "+heroi.getOuro());

                            return heroi;
                        }

                    }else {
                        System.out.println("Nao tens items meu menino!");
                    }

                    break;
                default:
                    System.out.println("Ataque Invalido!");
            }
        }while (heroi.getHP()>0 && npc.getHP()>0);

        if (heroi.getHP()<=0){
            return npc;

        } else if (npc.getHP()<=0) {
            return heroi;
        }

        return null;

    }
    
}
