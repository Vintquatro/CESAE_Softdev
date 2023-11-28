public class Triangulo extends FormaGeometrica{
    private double largura, altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calculararea() {
        System.out.println("Area Triangulo: ");
        System.out.println(largura*altura);
    }
}
