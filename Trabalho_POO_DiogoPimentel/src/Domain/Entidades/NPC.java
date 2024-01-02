package Domain.Entidades;

public class NPC extends Entidade{
    protected int ouro;

    public NPC(String nome, int HP, int maxHP, int power, int ouro) {
        super(nome, HP, maxHP, power);
        this.ouro = ouro;
    }


}
