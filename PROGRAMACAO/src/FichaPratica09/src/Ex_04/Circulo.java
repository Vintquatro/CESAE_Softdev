package Ex_04;

public class Circulo {

    private double raio;
    private double pi=3.14;

    public Circulo(Double raio){
        this.raio=raio;
    }

    public double areacirc(){
        double areacirc= pi*(raio*raio);
        return areacirc;
    }
}

