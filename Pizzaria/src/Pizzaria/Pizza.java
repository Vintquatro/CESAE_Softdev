package Pizzaria;

import Enums.BasePizza;
import Enums.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {


    private String codigo,nome,desc;
    private double preco;
    private TamanhoPizza tamanho;
    private ArrayList<Ingredientes> ingredientes;

    public Pizza(String codigo, String nome, String desc, double preco, TamanhoPizza tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.desc = desc;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<Ingredientes>(5);

    }


    public void addingredientes(Ingredientes novoIngrediente){
        ingredientes.add(novoIngrediente);
    }


    public void addtopping(Topping novotopping){

        if(ingredientes.isEmpty()){
            System.out.println("SEM BASE!");
        }else {
            ingredientes.add(novotopping);
        }
    }

    public void addbase(Base novabase){

        if(ingredientes.isEmpty()){
            ingredientes.add(novabase);
        }else {
            System.out.println("PODE ADICIONAR INGREDIENTES");
        }
    }


    public void compararPizza() {
        int contCarne = 0, contFrutosMar = 0, contQueijo = 0, contVegetal = 0;
        System.out.println();

        for (int i = 1; i < ingredientes.size(); i++) {

            if (ingredientes.get(i) instanceof Carne) {
                contCarne++;
            }
            if (ingredientes.get(i) instanceof FrutosDoMar) {
                contFrutosMar++;
            }
            if (ingredientes.get(i) instanceof Vegetal) {
                contVegetal++;
            }
            if (ingredientes.get(i) instanceof Queijo) {
                contQueijo++;
            }
        }

        if (contCarne==(ingredientes.size()-1)){
            System.out.println("Pizza de Carne");
        } else if (contFrutosMar==(ingredientes.size()-1)) {
            System.out.println("Pizza do Mar");
        } else if (contVegetal==(ingredientes.size()-1)) {
            System.out.println("Pizza Vegetariana");
        } else if (contCarne==1 && contFrutosMar==1 && contVegetal==1 && contQueijo==1) {
            System.out.println("Pizza Completa");
        } else {
            System.out.println("Pizza Mista");
        }

    }





    public void editarquantidade(Ingredientes ingrediente,double novaquantidade){
        ingrediente.setQuantidade(novaquantidade);
    }

    public void removeingrediente(Ingredientes removeringrediente){
        ingredientes.remove(removeringrediente);
    }

    public double calculadoracalorias(){
        double caloriastotal=0;

        for (Ingredientes ingredienteatual : this.ingredientes){
            caloriastotal+= ingredienteatual.getCaloriasPorMedida()* ingredienteatual.getQuantidade();
        }
        return caloriastotal;
    }


    public void pizzadescricao(){
        int contador=1;

        System.out.println("CODIGO: "+this.codigo);
        System.out.println("Descricao: "+this.desc);
        System.out.println("Preço: "+ this.preco);
        if (this.tamanho.equals(TamanhoPizza.GRANDE)){
            System.out.println("Tamanho: Grande");
        }
        if (this.tamanho.equals(TamanhoPizza.MEDIA)){
            System.out.println("Tamanho: Media");
        }
        if (this.tamanho.equals(TamanhoPizza.PEQUENA)){
            System.out.println("Tamanho: Pequena");
        }

        for (Ingredientes ingredienteatual:this.ingredientes){
            System.out.println("Ingredientes "+contador++ +" "+ingredienteatual.getCodigo()+" | "+ingredienteatual.getNome()+" | "+ingredienteatual.getUnidadeMedida()+" | "+ingredienteatual.getCaloriasPorMedida()+" | "+ingredienteatual.getQuantidade());
        }

    }



}
