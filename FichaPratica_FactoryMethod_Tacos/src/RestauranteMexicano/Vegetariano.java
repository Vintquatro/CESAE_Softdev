package RestauranteMexicano;

public class Vegetariano extends Taco {
    @Override
    public void prepare() {
        System.out.println("A Preparar Taco Vegetariano");

    }

    @Override
    public void bake() {
        System.out.println("A cozinhar Taco Vegetariano");

    }

    @Override
    public void box() {
        System.out.println("A Embalar Taco Vegetariano");

    }
}
