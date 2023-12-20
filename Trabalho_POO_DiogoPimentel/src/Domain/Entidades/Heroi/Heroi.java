package Domain.Entidades.Heroi;

import Controllers.Ataques.EstrategiaAtaque;
import Domain.Entidades.Entidade;
import Domain.Entidades.NPC;
import Domain.Items.ArmaPrincipal;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.ItemHeroi;

import java.util.ArrayList;

public class Heroi extends Entidade {

    protected int  nivel,ouro;
    protected ArmaPrincipal armaPrincipal;
    protected ArrayList<Consumivel> inventario;
    protected EstrategiaAtaque estrategiaAtaque;


    public Heroi(String nome, int HP, int maxHP, int power, int nivel, int ouro, ArmaPrincipal armaPrincipal, EstrategiaAtaque estrategiaAtaque) {
        super(nome, HP, maxHP, power);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        this.estrategiaAtaque = estrategiaAtaque;
        this.inventario = new ArrayList<Consumivel>();
    }

    public void atacar(NPC inimigo){
        this.estrategiaAtaque.ataquePai(inimigo);
    }


    //TODO
    // Desenvolver este metodo
    public void usarPocao(){

        System.out.println("Que consumivel quer usar? ");

        System.out.println();


    }


    public void addInventario (ItemHeroi itemHeroi){

        if (itemHeroi instanceof ArmaPrincipal){
            ArmaPrincipal novaArma = (ArmaPrincipal) itemHeroi;
           this.armaPrincipal=novaArma;
        }else if (itemHeroi instanceof Consumivel){
            this.inventario.add((Consumivel) itemHeroi);
        }
    }



}
