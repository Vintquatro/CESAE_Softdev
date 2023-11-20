package Ex_05;

public class Carro {
    private String marca, modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        ligar();
    }

    public void ligar(){

        System.out.println("O carro está ligado!");

    }


}
