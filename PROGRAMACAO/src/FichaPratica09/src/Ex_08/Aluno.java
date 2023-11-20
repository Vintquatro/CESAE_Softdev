package Ex_08;

public class Aluno {

    private String nome,curso;
    private int idade;
    private double media;

    public Aluno(String nome, String curso, int idade, double media) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.media = media;
    }

    public void aprovado(){

        if(this.media<9.5){
            System.out.println("Aluno burro");
        }else {
            System.out.println("Aluno aprovado");
        }
    }
}
