package Escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> disciplinaCurso;
    private boolean longaDuracao;

    public Curso(String nome, boolean longaDuracao) {
        this.nome = nome;
        this.disciplinaCurso = new ArrayList<DisciplinaCurso>();
        this.longaDuracao = longaDuracao;
    }

    public void setDisciplinaCurso(ArrayList<DisciplinaCurso> disciplinaCurso) {
        this.disciplinaCurso = disciplinaCurso;
    }

    public Curso(){
        Scanner input = new Scanner(System.in);

        String nome;

        int duracao,num2;


        System.out.println("Nome Curso: ");
        nome= input.next();

        System.out.println("Disciplina");
        num2= input.nextInt();


    }

}
