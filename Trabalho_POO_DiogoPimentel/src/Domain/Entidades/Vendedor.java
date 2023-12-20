package Domain.Entidades;

import Domain.Entidades.Heroi.Heroi;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Vendedor {
private ArrayList<ItemHeroi> itemHerois;

    public Vendedor() {

        this.itemHerois = new ArrayList<ItemHeroi>();
    }





    public void vender(Heroi heroi){

    }

    public ArrayList<ItemHeroi> getItemHerois() {

        return itemHerois;
    }
}
