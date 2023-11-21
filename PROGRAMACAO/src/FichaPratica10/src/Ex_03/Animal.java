package Ex_03;

public class Animal {
    private String nome, especie, pais;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String pais, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimentacao, double pesoComida) {

        for (int i = 0; i < this.alimentacao.length; i++) {
            if (alimentacao.equals(this.alimentacao[i])) {
                System.out.println("O animal comeu!");
                this.peso += pesoComida;
                System.out.println("Engordou "+pesoComida+"kgs o seu " + this.especie + " " + nome + " tem agora " + this.peso + "KGs no total");
                return;
            }
        }
            System.out.println("O animal recusou essa comida");
            System.out.println(this.peso + " Kgs");
    }


}
