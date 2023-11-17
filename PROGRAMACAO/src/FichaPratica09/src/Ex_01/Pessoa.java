package Ex_01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    /**
     * Metodo construtor pessoa
     * @param nome nome da pessoa
     * @param idade idade da pessoa
     * @param altura altura da pessoa
     */
    Pessoa(String nome, int idade, double altura){

        this.nome=nome;
        this.idade=idade;
        this.altura=altura;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}


