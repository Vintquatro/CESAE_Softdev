package Ex_03;

import Ex_02.Pessoa;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome,cor,anoFabrico;
    private int tripulacao;
    private double capacidadecarga;
    private MarcaBarco marcabarco;
    private ArrayList<Peixe> peixepescado;
    private ArrayList<Marisco> mariscopescado;

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadecarga, MarcaBarco marcabarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadecarga = capacidadecarga;
        this.marcabarco = marcabarco;
        this.peixepescado = new ArrayList<>();
        this.mariscopescado = new ArrayList<>();

    }


    public void pescarpeixe(Peixe pescadela){

        if(this.capacidadecarga>5000) {
            this.peixepescado.add(pescadela);
            this.capacidadecarga+=pescadela.getPeso();
        }else {

            System.out.println("Capacidade Cheia");
        }
    }

    public void pescarmarisco(Marisco mariscada){

        if(this.capacidadecarga>5000) {
            this.mariscopescado.add(mariscada);
            this.capacidadecarga+=mariscada.getPeso();
        }else {

            System.out.println("Capacidade Cheia");
        }
    }


    public void largarpeixe(Peixe peixeEraser){
       this.mariscopescado.remove(peixeEraser);
    }










}
