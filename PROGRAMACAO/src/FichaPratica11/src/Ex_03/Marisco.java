package Ex_03;

public class Marisco {
    private String especie;
    double peso, precokg;

    public Marisco(String especie, double peso, double precokg) {
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
