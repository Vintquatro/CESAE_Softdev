package RestauranteMexicano;

public class TacoFactory {
    public static Taco criadorTacos(String type){
        switch (type){
            case "Vegetariano":
                return new Vegetariano();
            case "Carne":
                return new Carne();
            case "Frango":
                return new Frango();
            default: throw new IllegalArgumentException("Tipo produto invalido: "+type);
        }

    }

}
