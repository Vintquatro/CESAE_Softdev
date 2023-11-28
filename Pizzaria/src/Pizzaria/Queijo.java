package Pizzaria;

import Enums.Origem;
import Enums.TipoQueijo;
import Enums.UnidadeMedida;

public class Queijo extends Topping{
   private TipoQueijo queijo;

    public Queijo(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasPorMedida, double quantidade, Origem origem, TipoQueijo queijo) {
        super(codigo, nome, unidadeMedida, caloriasPorMedida, quantidade, origem);
        this.queijo = queijo;
    }


}
