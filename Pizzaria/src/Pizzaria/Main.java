package Pizzaria;
import static Enums.TamanhoPizza.*;
import static Enums.UnidadeMedida.*;

import Enums.BasePizza;
import Enums.Origem;
import Enums.TamanhoPizza;
import Enums.TipoQueijo;

public class Main {

    public static void main(String[] args) {

        Pizza pizza01 = new Pizza("P1991","PepperoniLovers","A melhor pizza de sempre!",20, MEDIA);




        Ingredientes peperoni = new Ingredientes("P1992","Peperoni",GRAMAS,1.5,200);
        Ingredientes atum = new Ingredientes("P1993","Atum",GRAMAS,2.5,100);
        Queijo queijopodre = new Queijo("P1994","Queijo Podre",GRAMAS,1.5,200,Origem.NACIONAL, TipoQueijo.MOZZARELA);

        Base base01= new Base("PA232","Finissima",32,23, BasePizza.FINA,"muito fina");
        Topping topping01 = new Topping("P3241","Chourica",GRAMAS,1.6,300, Origem.NACIONAL);

        // pizza01.addingredientes(peperoni);
        // pizza01.addingredientes(atum);
        // pizza01.addingredientes(queijopodre);



        pizza01.addtopping(topping01);
        pizza01.addbase(base01);
        pizza01.addtopping(queijopodre);
        pizza01.addtopping(topping01);


        System.out.println("");
        pizza01.pizzadescricao();





    }



}
