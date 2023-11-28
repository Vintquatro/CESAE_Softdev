package Pizzaria;

import Enums.Origem;
import Enums.TipoFrutosDoMar;
import Enums.UnidadeMedida;

public class FrutosDoMar extends  Topping{

   private TipoFrutosDoMar frutosDoMar;

    public FrutosDoMar(String codigo, String nome, UnidadeMedida unidadeMedida, double caloriasPorMedida, double quantidade, Origem origem, TipoFrutosDoMar frutosDoMar) {
        super(codigo, nome, unidadeMedida, caloriasPorMedida, quantidade, origem);
        this.frutosDoMar = frutosDoMar;
    }

}
