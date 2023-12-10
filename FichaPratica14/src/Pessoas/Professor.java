package Pessoas;

import Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoas{

    private ArrayList<AreaFormacao> areaFormacao;
    private  int nivelAcademico;

    public Professor(String nome, String email, String telemovel, int anoNascimento, ArrayList<AreaFormacao> areaFormacao, int nivelAcademico) {
        super(nome, email, telemovel, anoNascimento);
        this.nivelAcademico = nivelAcademico;
        this.areaFormacao= new ArrayList<AreaFormacao>();
    }

    @Override
    public void obterfuncao() {

    }

    @Override
    public void imprimirhorario() {

    }
}
