public class Retangulo extends FormaGeometrica {
    private double largura, comprimento;




    public Retangulo(double largura, double comprimento) {

        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public void calculararea() {
        System.out.println("AREA RETANGULO: ");
        System.out.println(this.comprimento*this.largura);
    }


}
