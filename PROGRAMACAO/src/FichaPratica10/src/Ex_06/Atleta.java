package Ex_06;

public class Atleta {
    private String nome,modalidade,pais;
    private double altura,peso;

    public Atleta(String nome, String modalidade, String pais, double altura, double peso) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
    }

    public void exibirdetalhes(){
        System.out.println(this.nome);
        System.out.println(this.modalidade);
        System.out.println(this.pais);
        System.out.println(this.altura);
        System.out.println(this.peso);

    }
}
