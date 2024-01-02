package Domain.Entidades;

import Domain.Items.ItemHeroi;

import java.util.ArrayList;

public class Vendedor {
private ArrayList<ItemHeroi> itemHerois;

    /**
     * Metodo para atribiuir o array como tipo de herois a objetos
     */
    public Vendedor() {
        this.itemHerois = new ArrayList<ItemHeroi>();
    }

    /**
     * Metodo para returnar items de heroi para o vendedor
     * @return
     */
    public ArrayList<ItemHeroi> getItemHerois() {
        return itemHerois;
    }
}
