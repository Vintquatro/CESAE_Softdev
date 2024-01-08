package Domain.Entidades;

import Domain.Items.ItemHeroi;

import java.util.ArrayList;

public class Vendedor {
private ArrayList<ItemHeroi> itemHerois;

    public Vendedor() {
        this.itemHerois = new ArrayList<ItemHeroi>();
    }


    public ArrayList<ItemHeroi> getItemHerois() {
        return itemHerois;
    }
}
