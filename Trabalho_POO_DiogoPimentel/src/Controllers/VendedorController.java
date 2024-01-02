package Controllers;

import Controllers.Ataques.Charisma;
import Controllers.Ataques.Melee;
import Controllers.Ataques.Ranged;
import Domain.Entidades.Heroi;
import Domain.Items.ArmaPrincipal;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class VendedorController {
    ArrayList<ItemHeroi> loja;

    public VendedorController() throws FileNotFoundException {
        ItemRepository repositorio = new ItemRepository("Ficheiros/ItensHeroiRPG.csv");
        this.loja = repositorio.getItemHerois();
    }

    public ArrayList<ItemHeroi> loja10RandomItems() throws FileNotFoundException {

        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();
        ArrayList<ItemHeroi> lojaVitrine = new ArrayList<>();

        int random;


        //Cria uma montra sem repetir valores
        for (int i = 0; i<10;i++){
            random = new Random().nextInt(0,loja.size());
            if(!arrayIndexAleatorio.contains(random)) {
                arrayIndexAleatorio.add(random);
                lojaVitrine.add(loja.get(random));
            }else {
                i--;
            }
            }

      return lojaVitrine;
    }



    public void vender(Heroi heroi,ArrayList<ItemHeroi> loja10){

        int opcao,preco;

        System.out.println("*Abriste o velcro da tua carteira do Homen aranha*");
        System.out.println("Verificaste que tens "+heroi.getOuro()+" paus na tua posse, irmão!");

        System.out.println("Escolha qual item quer comprar (1-"+loja10.size()+")");
        System.out.println("Ou insira 0 para voltar atras:");
        Scanner input = new Scanner(System.in);



        String rolePersonagem=null;
        if(heroi.getEstrategiaAtaque() instanceof Melee){
            rolePersonagem="Melee";

        } else if (heroi.getEstrategiaAtaque() instanceof Ranged) {

            rolePersonagem="Ranged";
        } else if (heroi.getEstrategiaAtaque() instanceof Charisma) {

            rolePersonagem="Charisma";
        }

        System.out.println(rolePersonagem);

        opcao= input.nextInt();

        //opcao de compra
       if(opcao>=1 && opcao<=loja10.size()){
           preco=loja10.get(opcao-1).getPreco();

           //verificacao se consegue comprar e se tem a classe correta para isso


           if (preco<=heroi.getOuro() && loja10.get(opcao-1).getHeroisPermitidos().contains(rolePersonagem)){
               //remocao do ouro
               heroi.setOuro(heroi.getOuro()-preco);


               //verificacao do tipo de compra
               if (loja10.get(opcao-1) instanceof Consumivel) {
                   System.out.println("Compraste um novo consumivel!");
                   Consumivel compra = (Consumivel)  loja10.get(opcao-1);
                   heroi.addInventario(compra);

               }else if (loja10.get(opcao-1) instanceof ArmaPrincipal){
                   System.out.println("Tens agora uma nova arma!");
                   ArmaPrincipal armaNova = (ArmaPrincipal) loja10.get(opcao-1);
                   heroi.setArmaPrincipal(armaNova);
               }
               loja10.remove(loja10.get(opcao - 1));
               vender(heroi,loja10);

           }else if (preco>heroi.getOuro()){
               System.out.println("Não guita para comprar esse item!");
               System.out.println();
               vender(heroi,loja10);
           }else if (!loja10.get(opcao-1).getHeroisPermitidos().contains(rolePersonagem)){
               System.out.println("Não és dessa classe cabeção!");
               System.out.println();
               vender(heroi,loja10);
           }


       }else{

           System.out.println("* Fazes um cumprimento secreto tipo os da NBA do Labron Jaimes com o teu parça * ");
           System.out.println("Até à proxima brother irmao!");
       }




    }





    public void imprimirLoja(ArrayList<ItemHeroi> lojinha) throws FileNotFoundException {
        int i = 1;
        for(ItemHeroi itemHeroiAtual: lojinha) {
            System.out.println("OPCAO: "+i++);
            itemHeroiAtual.ExibirDetalhesIH();
            System.out.println();
        }
    }



}
