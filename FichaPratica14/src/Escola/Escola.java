package Escola;

import Pessoas.Aluno;
import Pessoas.Funcionario;
import Pessoas.Professor;

import java.util.ArrayList;

public class Escola {

    private String nome, localizacao;
    private int lotMaxAlunos;
    private ArrayList<Professor> listaprofessores;
    private ArrayList<Disciplina> listadisciplina ;
    private ArrayList<Curso> listacursos ;
    private ArrayList<Aluno> listaAlunos ;
    private ArrayList<Funcionario> listaFuncionarios ;


    public Escola(String nome, String localizacao, int lotMaxAlunos) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotMaxAlunos = lotMaxAlunos;
        this.listaprofessores= new ArrayList<>();
        this.listadisciplina= new ArrayList<>();
        this.listacursos= new ArrayList<>();
        this.listaAlunos= new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
    }


    
}
