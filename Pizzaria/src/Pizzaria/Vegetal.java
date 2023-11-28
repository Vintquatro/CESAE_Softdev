package Pizzaria;

import Enums.Origem;
import Enums.TipoVegetal;
import Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal vegetal;

    public Vegetal(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasPorMedida, double quantidade, Origem origem, TipoVegetal vegetal) {
        super(codigo, nome, unidadeMedida, caloriasPorMedida, quantidade, origem);
        this.vegetal = vegetal;
    }

}
