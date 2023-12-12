package RestauranteMexicano;

public class Carne extends Taco{
    @Override
    public void prepare() {
        System.out.println("A Preparar Taco Carne");
    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco Carne");
    }

    @Override
    public void box() {
        System.out.println("A Embalar Taco Carne");
    }
}
