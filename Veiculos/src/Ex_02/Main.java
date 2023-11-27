package Ex_02;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Camiao camiao_01 = new Camiao("Renault","Sprinter",2020,210,4500,10,TipoGota.DIESEL,1000);
        Carro carro_01 = new Carro("Fiat","Punto",2000,500,600,7,TipoGota.GASOLINA,4);
        Carro carro_02 = new Carro("Fiat","500",2002,501,601,7,TipoGota.GASOLINA,4);

        Mota mota_01 = new Mota("Kawsaki","Ninja",2015,600,800,5,TipoGota.GASOLINA);

        carro_01.corrida(carro_02);

        System.out.println("");
        camiao_01.exibirDetalhes();
        System.out.println("");

        mota_01.corrida(camiao_01);
        camiao_01.calcularviagem(500,100);


        System.out.println("");

        carro_01.calcularcusto(150);

        System.out.println("");

        camiao_01.calcularviagem(1001,500);


    }
}
