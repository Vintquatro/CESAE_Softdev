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
        System.out.println("|               BEM VINDO AO NOSSO SITE!            |");
        System.out.println("|___________________________________________________|");


    }




    /**
     * Funcao para verificar o tipo de utilizador
     */
    public static void menuUtilizador() {
        Scanner input = new Scanner(System.in);
        String password,utilizador;





        //Input da string para login
        System.out.println("Insira ADMIN ou CLIENTE para iniciar sessão");
        System.out.println("---------Usuário é case sensitive----------");
        System.out.print("Login: ");
        utilizador = input.next();


        //Verificacao da string para login utilizador
        switch (utilizador) {

            case "CLIENTE":
                menuCLIENTE();
                break;


            case "ADMIN":
                do{
                    System.out.println("Insira a password:");
                    password=input.next();

                    if (!password.equals("pass123")){
                        System.out.println("Password incorreta!");
                    }
                }while (!password.equals("pass123"));

                //menuADMIN();

                break;



            default:
                    //Chamada da funcao para reset de utilizador
                do {
                    System.out.println("");
                    System.out.println("/!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\/!\\/!\\/!\\     ");
                    System.out.println("/!\\        Utilizador inválido       /!\\ ");
                    System.out.println("/!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\/!\\/!\\/!\\     ");
                    System.out.println("");
                    menuUtilizador();

                } while (!utilizador.equals("ADMIN") && !utilizador.equals("CLIENTE"));
        }
    }


    /**
     * Funcao para input de menu do cliente
     */
    public static void menuCLIENTE(){
        Scanner input = new Scanner(System.in);
        int i;


        System.out.println(" ________________________ ");
        System.out.println("|---1. Registo cliente---|");
        System.out.println("|---2. Estacionamento----|");
        System.out.println("|---3. Os nossos jogos---|");
        System.out.println("|---4. Editoras----------|");
        System.out.println("|________________________|");

        System.out.println("Escolha o menu a aceder: ");
        i=input.nextInt();

        switch (i){

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:

                System.out.println("Escolha um menu válido!");
                System.out.println();
                menuCLIENTE();

        }


    }



    public static void menuCLIENTE1(){
        Scanner input = new Scanner(System.in);

        String nome, email;
        int telemovel;


        System.out.println();

    }

    public static void menuCLIENTE2(){

    }

    public static void menuCLIENTE3(){

    }

    public static void menuCLIENTE4(){

    }


    public static void menuADMIN(){

    }

}




