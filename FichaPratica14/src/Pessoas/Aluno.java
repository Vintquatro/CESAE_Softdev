package Pessoas;

import Escola.Curso;

public class Aluno extends Pessoas{

    private Curso curso;
    private double mediaNotas;
    private String[][]pauta;

    public Aluno(String nome, String email, String telemovel, int anoNascimento, Curso curso, double mediaNotas) {
        super(nome, email, telemovel, anoNascimento);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta=new String[999][2];
    }

    @Override
    public void obterfuncao() {

    }

    @Override
    public void imprimirhorario() {

    }
}
