package Ex_02;

import java.io.FileNotFoundException;

public class Veiculos {
    private String marca, modelo;
    private int ano,potencia, cilindrada;
    private TipoGota tipoGota;
    double consumo;


    public Veiculos(String marca, String modelo, int ano, int potencia, int cilindrada, int consumo, TipoGota tipoGota) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
        this.tipoGota = tipoGota;
    }



    public void ligar(){

        if ((2023-this.ano)>30){
            if (this.tipoGota==TipoGota.DIESEL){
                System.out.println("Deita um pouco de fumo ...");
                System.out.println("Custa a pegar...");
                System.out.println("O carro esta ligado!");
                System.out.println("Vrum-vrum-vrum");
            }else {
                System.out.println("Custa a pegar… O carro está ligado!”\n" + "“Vrum-vrum-vrum");
            }


        }
        if ((2023-this.ano)<30){
            if (this.cilindrada<250){
                System.out.println("O carro está ligado!\n" + "Vruummmmmmm");
            }else {
                System.out.println("O carro está ligado!\n" + "VRUUMMMMMM");
            }
        }


    }

    public void corrida(Veiculos carro1) throws FileNotFoundException {

        if (this.potencia>carro1.potencia){
            System.out.println("***VENCENDOR***");
            this.exibirDetalhes();
        }

        if (this.potencia<carro1.potencia){
            System.out.println("***VENCENDOR***");
            carro1.exibirDetalhes();
        }

        if (this.potencia==carro1.potencia && this.cilindrada>carro1.cilindrada ){
            System.out.println("***VENCENDOR***");
            this.exibirDetalhes();
        }

        if (this.potencia==carro1.potencia && this.cilindrada<carro1.cilindrada){
            System.out.println("***VENCENDOR***");
            carro1.exibirDetalhes();
        }

        if (this.potencia==carro1.potencia && this.cilindrada==carro1.cilindrada && this.ano>carro1.ano){
            System.out.println("***VENCENDOR***");
            this.exibirDetalhes();
        }

        if (this.potencia==carro1.potencia && this.cilindrada==carro1.cilindrada && this.ano<carro1.ano){
            System.out.println("***VENCENDOR***");
            carro1.exibirDetalhes();
        }

        if (this.potencia==carro1.potencia && this.cilindrada==carro1.cilindrada && this.ano==carro1.ano){
            System.out.println("****EMPATE****");
        }
    }


    public void exibirDetalhes() throws FileNotFoundException {
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Potencia: "+ this.potencia+ " cv.");
        System.out.println("Cilindrada: "+this.cilindrada+" cc.");
        System.out.println(this.tipoGota);
    }

    public void consumo100(int kms){
        double kmsL;
        //12l aos 100kms= 1.2l km
        kmsL=this.consumo/100;

        kmsL=kms*kmsL;

        System.out.println("O consumo de "+kms+"KMs é de "+kmsL+" litros");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public TipoGota getTipoGota() {
        return tipoGota;
    }

    public double getConsumo() {
        return consumo;
    }
}
