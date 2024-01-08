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

    /**
     * Metodo para dar o caminho ao Repositorio
     * @throws FileNotFoundException
     */
    public VendedorController() throws FileNotFoundException {
        ItemRepository repositorio = new ItemRepository("Trabalho_POO_DiogoPimentel/Ficheiros/ItensHeroiRPG.csv");
        this.loja = repositorio.getItemHerois();
    }

    /**
     * Metodo para criar uma Loja com 10 items aleatorios de vendedor
     * @return
     * @throws FileNotFoundException
     */
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

    /**
     * Metodo Venda Item - usado para atribuir um item ao heroi e remove-lo do array
     * @param heroi
     * @param loja10
     */

    public void vender(Heroi heroi,ArrayList<ItemHeroi> loja10){

        int opcao,preco;

        System.out.println("*Abriste o velcro da tua carteira do Homen aranha*");
        System.out.println("Verificaste que tens "+heroi.getOuro()+" paus na tua posse, irmão!");

        System.out.println("");

        System.out.println("Escolhe qual item queres comprar (1-"+loja10.size()+")");
        System.out.println("Ou insire 0 para voltar atras:");
        Scanner input = new Scanner(System.in);
        opcao= input.nextInt();



        String rolePersonagem=null;
        if(heroi.getEstrategiaAtaque() instanceof Melee){
            rolePersonagem="Melee";

        } else if (heroi.getEstrategiaAtaque() instanceof Ranged) {

            rolePersonagem="Ranged";
        } else if (heroi.getEstrategiaAtaque() instanceof Charisma) {

            rolePersonagem="Charisma";
        }





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
                    System.out.println();
                    Consumivel compra = (Consumivel)  loja10.get(opcao-1);
                    heroi.addInventario(compra);

                }else if (loja10.get(opcao-1) instanceof ArmaPrincipal){
                    System.out.println("Tens agora uma nova arma!");
                    System.out.println();
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
            System.out.println();
        }


    }


    /**
     * Metodo que imprime a loja com os items que o vendedor tem no ficheiro CSV
     * @param lojinha
     * @throws FileNotFoundException
     */

    public void imprimirLoja(ArrayList<ItemHeroi> lojinha) throws FileNotFoundException {
        int i = 1;
        for(ItemHeroi itemHeroiAtual: lojinha) {
            System.out.println("OPCAO: "+i++);
            itemHeroiAtual.ExibirDetalhesIH();
            System.out.println();
        }
    }



}
