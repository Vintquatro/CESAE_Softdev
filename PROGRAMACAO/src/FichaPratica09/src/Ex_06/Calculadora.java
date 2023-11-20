package Ex_06;

import java.util.Scanner;

public class Calculadora {

    public Calculadora() {

    }

    public double adicao(double num1,double num2){

        double adicao;
        adicao=num1+num2;
        System.out.println("soma de "+num1+"+"+num2+"="+adicao);
        return adicao;
    }

    public void sub(double num1,double num2){

        double sub;
        sub=num1+num2;
        System.out.println("subtracao de "+num1+"+"+num2+"="+sub);
    }
    public void multi(double num1,double num2){

        double multi;
        multi=num1+num2;
        System.out.println("multiplicacao de "+num1+"+"+num2+"="+multi);
    }
    public void div(double num1,double num2){

        double div;
        div=num1+num2;
        System.out.println("divisao de "+num1+"+"+num2+"="+div);
    }

}
