package FichaPratica06;

import java.util.Scanner;

public class Ex_01 {

    /**
     * Metodo que, de acordo com um animal, imprime na consola o seu barulho
     * @param animal Especie do Animal
     */
    public static void fazerbarulho(String animal){

        switch (animal){
            case "cao":
                System.out.println("Woof woof");
            break;
            case "gato":
                System.out.println("Meow");
                break;
            case "peixe":
                System.out.println("Glub glub");
                break;
            case "vaca":
                System.out.println("Muuuuuu");
                break;
            case "porco":
                System.out.println("Oinc Oinc");
                break;
            default:
                System.out.println("animal nao valido");

        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o animal: ");
        String  animal=input.next();

        fazerbarulho(animal);

    }
}
