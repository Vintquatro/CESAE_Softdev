package Ex_02;

import java.io.FileNotFoundException;

public class Camiao extends Veiculos{

    private double capacidadecarga;

    public Camiao(String marca, String modelo, int ano, int potencia, int cilindrada, int consumo, TipoGota tipoGota, double capacidadecarga) {
        super(marca, modelo, ano, potencia, cilindrada, consumo, tipoGota);
        this.capacidadecarga = capacidadecarga;
    }


    public void calcularviagem(double carga,double distancia){
       double litroscomKMcomCarga=(this.getConsumo()/100)+((carga/100)*0.001);
       double litropor100kmcomcarga= litroscomKMcomCarga*100;
       double totalviagem= (distancia*litroscomKMcomCarga)*1.95;


        if(carga<=this.capacidadecarga){

            System.out.println("Consumo 100 km: "+litropor100kmcomcarga );
            System.out.println("TOTAL VIAGEM: "+totalviagem+"€");
        }else{
            System.out.println("Carga Ultrapassada");
        }

    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {
        super.exibirDetalhes();
        System.out.println("Capacidade Carga: "+this.capacidadecarga);
    }
}
