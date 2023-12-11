package RestauranteMexicano;

public class Main {
    public static void main(String[] args) {
        Taco Vegetariano = TacoFactory.criadorTacos("Vegetariano");
        Taco Carne = TacoFactory.criadorTacos("Carne");
        Taco Frango = TacoFactory.criadorTacos("Frango");


    Carne.prepare();
    Carne.bake();
    Carne.box();

    }
}
