package Controllers;

import Domain.Entidades.Heroi.Heroi;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

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


// TODO: 20/12/2023 faz isto depois d'hoje 
        
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
