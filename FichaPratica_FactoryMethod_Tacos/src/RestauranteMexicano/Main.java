package RestauranteMexicano;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Taco Vegetariano = TacoFactory.criadorTacos("Vegetariano");
        Taco Carne = TacoFactory.criadorTacos("Carne");
        Taco Frango = TacoFactory.criadorTacos("Frango");



        String teste = "boas isto é um teste de texto para o jogo";

        for (int i=0; i <teste.length();i++){
            System.out.print(teste.charAt(i));
            Thread.sleep(150);
        }

        System.out.println();

    Carne.prepare();
    Carne.bake();
    Carne.box();

    }
}
