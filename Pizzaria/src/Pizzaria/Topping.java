package Pizzaria;

import Enums.Origem;
import Enums.UnidadeMedida;

public class Topping extends Ingredientes{
    private Origem origem;

    public Topping(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasPorMedida, double quantidade, Origem origem) {
        super(codigo, nome, unidadeMedida, caloriasPorMedida, quantidade);
        this.origem = origem;
    }


}
