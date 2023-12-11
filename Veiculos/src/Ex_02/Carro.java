package Ex_02;

import java.awt.font.TextHitInfo;
import java.io.FileNotFoundException;

public class Carro extends Veiculos {

    private int quantidadepassageiros;

    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, int consumo, TipoGota tipoGota, int quantidadepassageiros) {
        super(marca, modelo, ano, potencia, cilindrada, consumo, tipoGota);
        this.quantidadepassageiros = quantidadepassageiros;
    }

    public void calcularcusto(double viagemkm){
        double valortotalviagem;
        double kmsL;

        // Litros por KM
        kmsL=this.consumo/100;
        //Quantos litros vai gastar
        kmsL=viagemkm*kmsL;

        if(this.getTipoGota().equals(TipoGota.GASOLINA)){
            System.out.println("O preco da viagem vai ser: "+(kmsL*2.1));
        }
        if(this.getTipoGota().equals(TipoGota.DIESEL)){
            System.out.println("O preco da viagem vai ser: "+(kmsL*1.95));
        }
        if(this.getTipoGota().equals(TipoGota.GPL)){
            System.out.println("O preco da viagem vai ser: "+(kmsL*1.15));
        }
        if(this.getTipoGota().equals(TipoGota.ELETRICO)){
            System.out.println("O preco da viagem vai ser: "+(kmsL*0.12));
        }
    }



    @Override
    public void exibirDetalhes() throws FileNotFoundException {
        super.exibirDetalhes();
        System.out.println("Quantidade passageiros"+this.quantidadepassageiros);
    }
}
