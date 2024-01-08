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

    protected Entidade() {
    }

    /** Metodo para exibir detalhes da Superclass da personagem
     *
     */
    public void ExibirDetalhes(){
        System.out.println("Stats do teu gaijo fudengo");
        System.out.println("Nome: "+this.nome);
        System.out.println("Vida Atual: "+this.HP);
        System.out.println("Vida Máxima: "+this.maxHP);
        System.out.println("Força: "+this.power);
    }


    public int getPower() {
        return power;
    }

    public int getHP() {
        return HP;
    }

    public String getNome() {
        return nome;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
