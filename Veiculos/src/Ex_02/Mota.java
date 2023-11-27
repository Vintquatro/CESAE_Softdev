package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculos{

    public Mota(String marca, String modelo, int ano, int potencia, int cilindrada, int consumo, TipoGota tipoGota) {
        super(marca, modelo, ano, potencia, cilindrada, consumo, tipoGota);
    }

    @Override
    public void exibirDetalhes() throws FileNotFoundException {
        super.exibirDetalhes();

        Scanner abrirficheiro= new Scanner(new File("Ficheiros/Mota.txt"));
        String linha;
        while (abrirficheiro.hasNextLine()){
            linha=abrirficheiro.nextLine();
            System.out.println(linha);
        }
    }



}
