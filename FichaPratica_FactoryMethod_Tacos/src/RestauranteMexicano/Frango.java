package RestauranteMexicano;

public class Frango extends Taco{
    @Override
    public void prepare() {
        System.out.println("A Preparar Taco Frango");

    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco Frango");

    }

    @Override
    public void box() {
        System.out.println("A Embalar Taco Frango");

    }
}
