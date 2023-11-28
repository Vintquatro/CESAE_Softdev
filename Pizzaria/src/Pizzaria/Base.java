package Pizzaria;

import Enums.BasePizza;
import Enums.UnidadeMedida;

public class Base extends Ingredientes{
    private BasePizza basePizza;
    private String descricao;

    public Base(String codigo, String nome, double caloriasPorMedida, double quantidade, BasePizza basePizza, String descricao) {
        super(codigo, nome,UnidadeMedida.GRAMAS, caloriasPorMedida, quantidade);
        this.basePizza = basePizza;
        this.descricao = descricao;
    }

    public void detalhes(){
        System.out.println(this.getUnidadeMedida());
    }

    public BasePizza getBasePizza() {
        return basePizza;
    }
}
