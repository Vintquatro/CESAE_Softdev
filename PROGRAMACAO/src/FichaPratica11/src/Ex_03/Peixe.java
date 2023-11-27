package Ex_03;

public class Peixe {
    private String especie;
    double peso, precokg;

    public Peixe(String especie, double peso, double precokg) {
        this.especie = especie;
        this.peso = peso;
        this.precokg = precokg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecokg() {
        return precokg;
    }
}
