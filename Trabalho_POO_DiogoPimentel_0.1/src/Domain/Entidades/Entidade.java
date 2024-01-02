package Domain.Entidades;

public abstract class Entidade {

    protected String nome;
    protected int HP,maxHP,power;

    public Entidade(String nome, int HP, int maxHP, int power) {
        this.nome = nome;
        this.HP = HP;
        this.maxHP = maxHP;
        this.power = power;
    }

    /** Metodo para exibir detalhes da Superclass da personagem
     *
     */
    public void ExibirDetalhes(){
        System.out.println("Personagem: ");
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida Atual: "+this.HP);
        System.out.println("Vida Máxima: "+this.maxHP);
        System.out.println("Força: "+this.power);
    }

}
