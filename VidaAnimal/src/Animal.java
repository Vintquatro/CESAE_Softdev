import Enums.AlimentacaoDieta;

public class Animal extends SerVivo{
    private boolean fome;
    private double pesoKG,inteligencia;
    private AlimentacaoDieta alimentacaoDieta;
    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double pesoKG, double inteligencia, AlimentacaoDieta alimentacaoDieta, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.pesoKG = pesoKG;
        this.inteligencia = inteligencia;
        this.alimentacaoDieta = alimentacaoDieta;
        this.barulho = barulho;
    }

    public String getBarulho() {
        return barulho;
    }

    public double getPesoKG() {
        return pesoKG;
    }

    public boolean isFome() {
        return fome;
    }

    public AlimentacaoDieta getAlimentacaoDieta() {
        return alimentacaoDieta;
    }
}
