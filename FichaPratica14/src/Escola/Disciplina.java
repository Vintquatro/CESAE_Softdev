package Escola;

import Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }


    public Disciplina(){

        String nome;
        AreaFormacao area=null;
        int num1,num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Nome Disciplina: ");
        nome= input.next();


        System.out.println("Area Formacao: ");
        num1= input.nextInt();

        if (num1==1){
            area= AreaFormacao.INFORMATICA;
        }else if (num1==2){
            area=AreaFormacao.ECONOMIA;
        } else if (num1==3) {
            area=AreaFormacao.MEDICINA;
        } else if (num1==4) {
            area=AreaFormacao.CONTABILIDADE;
        }

        System.out.println("Horas da disciplina: ");
        num2= input.nextInt();

        this.nome=nome;
        this.area=area;
        this.duracaoHoras=num2;



    }
}
