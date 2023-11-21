package Ex_01;

public class Main {

    public static void main(String[] args) {

        Carro BMW = new Carro("BMW","i9",2023,800,500,11,TipoGota.GASOLINA);
        Carro FIAT = new Carro("Fiat","Punto - Alfena Edition",1990,500,400,8,TipoGota.DIESEL);
        Carro FIATermesinde = new Carro("Fiat","Punto - Ermesinde Edition",1990,500,400,8,TipoGota.DIESEL);

        FIAT.ligar();
        System.out.println("");
        FIAT.corrida(BMW);
        System.out.println("");
        System.out.println("CORRIDA 2");
        FIAT.corrida(FIATermesinde);
        System.out.println("");
        System.out.println("CONSUMOS: ");
        FIAT.consumo100(69);
        BMW.consumo100(67);

    }
}
