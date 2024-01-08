package Domain.Entidades;

import Controllers.Ataques.Charisma;
import Controllers.Ataques.EstrategiaAtaque;
import Controllers.Ataques.Melee;
import Controllers.Ataques.Ranged;
import Domain.Entidades.Entidade;
import Domain.Entidades.NPC;
import Domain.Items.ArmaPrincipal;
import Domain.Items.Consumiveis.Consumivel;
import Domain.Items.ItemHeroi;

import java.util.ArrayList;
import java.util.Scanner;

public class Heroi extends Entidade {

    protected int nivel, ouro;
    protected ArmaPrincipal armaPrincipal;
    protected ArrayList<Consumivel> inventario;
    protected EstrategiaAtaque estrategiaAtaque;

    //Cenas do Singleton
    private static Heroi instance;

    /**
     * Controlador para criaçao de apenas uma personagem / Heroi
     * @throws InterruptedException
     */
    private Heroi() throws InterruptedException {
        String nome;
        int facil = 25, dificil = 10, maxHP=0, hp, power=0, nivel=0, ouro=0, opcao = 0,tipoCombate=0;
        EstrategiaAtaque tipoAtaque = null;
        ArmaPrincipal arma = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Diz lá o nome para o gaijo que vais criar, ou gaija porque estamos em 2023 *cough* 2069");
        nome = input.nextLine();
        System.out.println();
        System.out.println("E queres jogar isto no modo Descontra (Fácil) ou no modo 'Menino com Spawn em África' (Dificil)? ");
        System.out.println("Mete: 1 (para Fácil) ou 2 (para Dificíl)");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Começas com 100 Pontos de vida e 15 de força de estouro");
                System.out.println("Tens 25 pontos para distribuir pela tua vida e a tua força de estouro!");
                System.out.println("Quantos pontos de 0-25, queres por na vida? (Os restantes serao repartidos automaticamente)");
                maxHP = input.nextInt();
                facil = facil - maxHP;
                maxHP += 100;
                power = 15 + facil;
                System.out.println("Tens agora " + maxHP + " Pontos de vida e " + power + " pontos de estouro!");
                ouro = 75;
                System.out.println("");
                System.out.println("Recebeste: " + ouro + " paus do IRS");
                break;
            case 2:
                System.out.println("Começas com 100 Pontos de vida e 15 de força de estouro");
                System.out.println("Tens 10 pontos para distribuir pela tua vida e a tua força de estouro!");
                System.out.println("Quantos pontos de 0-10, queres por na vida? (Os restantes serao repartidos automaticamente)");
                maxHP = input.nextInt();
                dificil = dificil - maxHP;
                maxHP += 100;
                power = 15 + dificil;
                System.out.println("Tens agora " + maxHP + " Pontos de vida e " + power + " pontos de estouro!");
                ouro = 40;
                System.out.println("Recebeste: " + ouro + " paus que António Costa se esqueceu de dar o ano passado");
                break;

            default:
        }


        System.out.println();
        hp=maxHP;

        System.out.println("Queres rebentar beiças como?");
        System.out.println("1 --- À mão ---");
        System.out.println("2 --- À conas ('à distância') ---");
        System.out.println("3 --- Ao insulto ---");
        System.out.println("Tenta não 'f*der' o programa e mete só de 1 a 3");
        tipoCombate=input.nextInt();



        switch (tipoCombate){
            case 1:
                tipoAtaque = new Melee();
                break;
            case 2:
                tipoAtaque = new Ranged();
                break;
            case 3:
                tipoAtaque = new Charisma();
                break;
            default:
        }

        this.nome = nome;
        this.maxHP = maxHP;
        this.HP = hp;
        this.power = power;
        this.nivel = nivel;
        this.ouro = ouro;
        this.estrategiaAtaque = tipoAtaque;
        this.armaPrincipal = null;
        this.inventario = new ArrayList<>();

    }

    /**
     * Metodo static para criar apenas uma personagem
     * Singleton
     * @return instance
     * @throws InterruptedException
     */
    public static Heroi getInstance() throws InterruptedException {

        if (instance == null) {
            instance = new Heroi();
        }
        return instance;
    }



    public Heroi(String nome, int HP, int maxHP, int power, int nivel, int ouro, ArmaPrincipal armaPrincipal, EstrategiaAtaque estrategiaAtaque) {
        super(nome, HP, maxHP, power);
        this.nivel = nivel;
        this.ouro = ouro;
        this.armaPrincipal = armaPrincipal;
        this.estrategiaAtaque = estrategiaAtaque;
        this.inventario = new ArrayList<Consumivel>();
    }

    public Entidade atacar(NPC inimigo, Heroi heroi){
      return heroi.getEstrategiaAtaque().ataquePai(inimigo,heroi);
    }




    public void addInventario (Consumivel consumivel){
        this.inventario.add(consumivel);
    }


    @Override
    public void ExibirDetalhes() {

        super.ExibirDetalhes();
        if (this.estrategiaAtaque instanceof Melee){
            System.out.println("Tipo de gaijo: Dá porrada com as mãos");
            System.out.println();
        }
        if (this.estrategiaAtaque instanceof Ranged){
            System.out.println("Tipo de gaijo: Dá porrada à distância");
        }
        if (this.estrategiaAtaque instanceof Charisma){
            System.out.println("Tipo de gaijo: Dá porrada mental");
        }
        if (this.armaPrincipal==null){
        }else {
            this.armaPrincipal.ExibirDetalhesIH();
        }

    }

    public int getOuro() {
        return ouro;
    }


    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public EstrategiaAtaque getEstrategiaAtaque() {
        return estrategiaAtaque;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public ArrayList<Consumivel> getInventario() {
        return inventario;
    }

    public ArmaPrincipal getArmaPrincipal() {

        return armaPrincipal;
    }

    public int getNivel() {
        return nivel;
    }


    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
