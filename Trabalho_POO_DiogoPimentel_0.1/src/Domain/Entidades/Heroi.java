package Domain.Entidades;

import java.util.ArrayList;

public abstract class Heroi extends Entidade{

    protected int  nivel,ouro;
    protected ArmaPrincipal armaPrincipal;
    protected ArrayList<Consumivel> inventario;



    public Heroi(String nome, int HP, int maxHP, int power) {
        super(nome, HP, maxHP, power);
    }


}
