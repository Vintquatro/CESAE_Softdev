package Domain.Entidades;

import Domain.Entidades.Heroi.Heroi;
import Domain.Items.ItemHeroi;

import java.util.ArrayList;

public class Vendedor {
private ArrayList<ItemHeroi> itemHerois;

    public Vendedor() {
        this.itemHerois = new ArrayList<ItemHeroi>();
    }



    //TODO
    // PASSAR ISTO PARA O CONTROLLER

    public void imprimirLoja(){
        //todo
        //
    }

    public void vender(Heroi heroi){

    }

    public ArrayList<ItemHeroi> getItemHerois() {
        return itemHerois;
    }
}
