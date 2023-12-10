import Enums.Familia;

public class Planta extends SerVivo{
    private Familia familia;
    private int GrauDefesa;

    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        GrauDefesa = grauDefesa;
    }

    public Familia getFamilia() {
        return this.familia;
    }
}
