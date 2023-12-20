package Domain.Entidades.Heroi;

import Controllers.Ataques.EstrategiaAtaque;
import Domain.Items.ArmaPrincipal;

public class Charisma extends Heroi{
    public Charisma(String nome, int HP, int maxHP, int power, int nivel, int ouro, ArmaPrincipal armaPrincipal, EstrategiaAtaque estrategiaAtaque) {
        super(nome, HP, maxHP, power, nivel, ouro, armaPrincipal, estrategiaAtaque);
    }
}
