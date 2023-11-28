package Pizzaria;

import Enums.Origem;
import Enums.TipoCarne;
import Enums.UnidadeMedida;

public class Carne extends Topping{
    private TipoCarne carne;

    public Carne(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasPorMedida, double quantidade, Origem origem, TipoCarne carne) {
        super(codigo, nome, unidadeMedida, caloriasPorMedida, quantidade, origem);
        this.carne = carne;
    }
}
