public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }


    @Override
    public void calculararea() {
        System.out.println("AREA CIRCULO: ");
        System.out.println(Math.PI*(raio*raio));
    }
}
