package Pizzaria;

import Enums.UnidadeMedida;

public class Ingredientes {

    private String codigo,nome;
    private UnidadeMedida unidadeMedida;
    private double caloriasPorMedida,quantidade;

    public Ingredientes(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasPorMedida, double quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasPorMedida = caloriasPorMedida;
        this.quantidade = quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }




    //PERGUNTAR AO VITOR SE É PRECISO .THIS E O PORQUE? TODO



    public double getCaloriasPorMedida() {
        return caloriasPorMedida;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }


    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}
