package FichaPratica_PE;

import java.util.Scanner;

public class LibrariaFuncoes {

    /**
     * função de grafismo de boas vindas
     */
    public static void bemvindo() {

        System.out.println(" ___________________________________________________");
        System.out.println("|                                 _             _   |");
        System.out.println("|                                | |           | |  |");
        System.out.println("|  __ _  __ _ _ __ ___   ___  ___| |_ __ _ _ __| |_ |");
        System.out.println("| / _` |/ _` | '_ ` _ \\ / _ \\/ __| __/ _` | '__| __||");
        System.out.println("|| (_| | (_| | | | | | |  __/\\__ \\ || (_| | |  | |_ |");
        System.out.println("| \\__, |\\__,_|_| |_| |_|\\___||___/\\__\\__,_|_|   \\__||");
        System.out.println("|  __/ |                                            |");
        System.out.println("| |___/                                             |");
        System.out.println("|               BEM BINDO AO NOSSO SITE!            |");
        System.out.println("|               PARA GAMERS DO NORTE!               |");
        System.out.println("|___________________________________________________|");


    }

    /**
     * Funcao para verificar o tipo de utilizador
     *
     * @param utilizador
     * @return login
     */
    public static String menuUtilizador(String utilizador) {
        Scanner input = new Scanner(System.in);
        int contador=0;
        System.out.println("Insira ADMIN ou CLIENTE para iniciar sessão");
        System.out.println("---------Usuário é case sensitive----------");
        System.out.print("Login: ");
        utilizador = input.next();


        switch (utilizador) {
            case "CLIENTE":
                break;
            case "ADMIN":
                break;
            default:

                do {
                    contador++;
                    System.out.println("");
                    System.out.println("/!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\/!\\/!\\/!\\     ");
                    System.out.println("/!\\  Utilizador inbálido meu munino! /!\\ ");
                    System.out.println("/!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\/!\\/!\\/!\\     ");
                    System.out.println("");
                    System.out.println("Insira ADMIN ou CLIENTE para iniciar sessão");
                    System.out.println("---------Usuário é case sensitive----------");
                    System.out.print("Login: ");
                    utilizador = input.next();

                    if (contador>2){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("/!\\  Meu menino, acorda pah bida e mete o login direito... /!\\ ");
                    }

                } while (!utilizador.equals("ADMIN") && !utilizador.equals("CLIENTE"));
        }

        return (utilizador);
    }
}
