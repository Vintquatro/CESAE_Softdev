package Ex_02;

public class Pessoa {
    private String nome,email;
    private int idade,telemovel;

    public Pessoa(String nome, String email, int idade, int telemovel) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telemovel = telemovel;
    }


    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
