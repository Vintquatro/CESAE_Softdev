package View;

import Controllers.Ataques.Charisma;
import Controllers.Ataques.EstrategiaAtaque;
import Controllers.Ataques.Melee;
import Controllers.Ataques.Ranged;
import Controllers.HeroiController;
import Controllers.VendedorController;
import Domain.Entidades.Entidade;
import Domain.Entidades.Heroi;
import Domain.Entidades.NPC;
import Domain.Items.ArmaPrincipal;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.Consumiveis.ConsumivelCombate;
import Domain.Items.ItemHeroi;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Jogo {

   /* public static void main(String[] args) throws InterruptedException {
        System.out.println("GTA 6");
        System.out.println();

        Heroi heroiteste = Heroi.getInstance();
        heroiteste.ExibirDetalhes();
        ArmaPrincipal maos = new ArmaPrincipal("Maos",0,10,20);
        heroiteste.setArmaPrincipal(maos);
        NPC npc1 = new NPC("Ricardo Pasteleiro",1,200,50,50);

        ConsumivelCombate c4 = new ConsumivelCombate("C4",0,50);
        heroiteste.addInventario(c4);


        heroiteste.atacar(npc1,heroiteste);

    }*/

    public static void jogo1() throws InterruptedException, FileNotFoundException {

        System.out.println("GTA 6");
        System.out.println();

        Heroi heroiteste = Heroi.getInstance();



     /*   if (heroiteste.getEstrategiaAtaque() instanceof Melee){
            ArmaPrincipal maos = new ArmaPrincipal("Maos",0,10,15);
            heroiteste.setArmaPrincipal(maos);
        }

        if (heroiteste.getEstrategiaAtaque() instanceof Ranged){
            ArmaPrincipal calhau = new ArmaPrincipal("Calhau",0,15,20);
            heroiteste.setArmaPrincipal(calhau);
        }

        if (heroiteste.getEstrategiaAtaque() instanceof Charisma){
            ArmaPrincipal conhecimentoDeRua = new ArmaPrincipal("Conhecimento De Rua",0,10,20);
            heroiteste.setArmaPrincipal(conhecimentoDeRua);
        } */


        heroiteste.ExibirDetalhes();

        ArmaPrincipal maos = new ArmaPrincipal("Maos",0,10,20);
        heroiteste.setArmaPrincipal(maos);


        NPC npc1 = new NPC("Ricardo Pasteleiro",1,200,10,50);
        HeroiController heroiMetodos = new HeroiController();

        ConsumivelCombate c4 = new ConsumivelCombate("C4",0,5);
        heroiteste.addInventario(c4);

        heroiteste.atacar(npc1,heroiteste);



        // TODO: 25/12/2023 DESENVOLVER ISTO

       /* if (heroiteste.atacar(npc1,heroiteste) instanceof NPC){

        } else if (heroiteste.atacar(npc1,heroiteste) instanceof Heroi) {

        }*/


        VendedorController vendedor = new VendedorController();
        ArrayList<ItemHeroi> loja10Main = vendedor.loja10RandomItems();
        vendedor.imprimirLoja(loja10Main);
        vendedor.vender(heroiteste,loja10Main);

       //HeroiController.lancarDados();

        heroiteste.ExibirDetalhes();

        heroiMetodos.usarPocao(heroiteste);

        heroiteste.ExibirDetalhes();
        //heroiteste.atacar(npc1,heroiteste);



    }








}
