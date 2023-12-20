import Controllers.VendedorController;
import Domain.Entidades.Heroi.Heroi;
import Domain.Entidades.Vendedor;
import Domain.Items.ItemHeroi;
import Repository.ItemRepository;
import View.Jogo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        VendedorController vendedor = new VendedorController();
        Heroi heroi1 = new Heroi("joao",10,100,100,1,500,null,null);
        //Jogo.menuCriacaoPersonagem();

        ArrayList<ItemHeroi> loja10Main = vendedor.loja10RandomItems();
        vendedor.imprimirLoja(loja10Main);

        vendedor.vender(heroi1,loja10Main);
    }
}
