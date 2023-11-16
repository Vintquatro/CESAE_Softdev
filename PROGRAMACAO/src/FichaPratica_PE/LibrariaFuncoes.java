package FichaPratica_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LibrariaFuncoes {

    //Formatar uma variavel com casas decimais para apenas 2 casas decimais. APLICADA no menuADMIN2 para o total
    public static DecimalFormat formatar = new DecimalFormat("0.00");


    //--------------------------------------------------------------------------------------------------
    //------------------------------------------B00T DO PROGRAMA----------------------------------------
    //--------------------------------------------------------------------------------------------------


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
    public static void menuUtilizador() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String password, utilizador;

        while (true){
            //Input da string para login
            System.out.println("Insira ADMIN ou CLIENTE para iniciar sessão");
            System.out.println("---------Usuário é case sensitive----------");
            System.out.print("Login: ");
            utilizador = input.next();


            //Verificacao da string para login utilizador
            switch (utilizador) {
                // loop infinito para que caso o login seja de cliente, fique apenas desse modo ate ser terminado o programa
                case "CLIENTE":
                    while (true){
                        menuCLIENTE();
                    }

                case "ADMIN":

                    //Condicao para a criacao de um loop infinito ate que o utilizador ponha a password correta
                    do {
                        System.out.println("Insira a password:");
                        password = input.next();

                        if (!password.equals("pass123")) {
                            System.out.println("Password incorreta!");
                        }
                    } while (!password.equals("pass123"));

                    // loop infinito para que caso o login seja de admin fique apenas desse modo ate ser terminado o programa
                    while (true){
                        menuADMIN();
                    }

                default:
                    //Chamada da funcao para reset de utilizador
                    System.out.println("");
                    System.out.println("/!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\/!\\/!\\/!\\     ");
                    System.out.println("/!\\        Utilizador inválido       /!\\ ");
                    System.out.println("/!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\ /!\\/!\\/!\\/!\\     ");
                    System.out.println("");

            }


        }
    }



    //--------------------------------------------------------------------------------------------------
    //------------------------------------------MENU CLIENTE--------------------------------------------
    //--------------------------------------------------------------------------------------------------


    /**
     * Funcao para input de menu do cliente
     */
    public static void menuCLIENTE() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int i;


        System.out.println(" ________________________ ");
        System.out.println("|---1. Registo cliente---|");
        System.out.println("|---2. Estacionamento----|");
        System.out.println("|---3. Os nossos jogos---|");
        System.out.println("|---4. Editoras----------|");
        System.out.println("|________________________|");

        System.out.println("Escolha o menu a aceder: ");
        i = input.nextInt();

        //Escolha da funcao para o menu a usar consoante o input de utilizador
        switch (i) {
            case 1:
                menuCLIENTE1();
                break;
            case 2:
                menuCLIENTE2();
                break;
            case 3:
                menuCLIENTE3(lerFicheiroParaMatriz("src/FichaPratica_PE/GameStart_V2.csv"));
                break;
            case 4:
                break;

            //Caso o valor nao esteja entre 1 e 4, da reset ao menu.
            default:
                System.out.println("Escolha um menu válido!");
                System.out.println();
                menuCLIENTE();

        }


    }

    //---------------------------------------FUNCOES MENU CLIENTE----------------------------------------

    /**
     * Funcao que recebe 3 input para 3 variaveis e as imprime
     * Formulario de criacao de cliente
     */
    public static void menuCLIENTE1() {
        Scanner input = new Scanner(System.in);
        String nome, email;
        int telemovel;

        System.out.println("*** Registo cliente***");

        System.out.println("Insira o seu nome: ");
        nome = input.nextLine();

        System.out.println("Insira o seu contacto: ");
        telemovel = input.nextInt();

        System.out.println("Insira o seu e-mail: ");
        email = input.next();

        System.out.println("***Registo criado com sucesso***");
        System.out.println(nome + " | " + telemovel + " | " + email);


        System.out.println();

    }

    /**
     * funcao para verificao dos lugares livres
     */
    public static void menuCLIENTE2() {
        int lugares = 0;

        System.out.println("*** Lugares de estacionamento disponiveis ***");
        //Ciclo que percorre 20 numeros triangulares
        for (int i = 1; i <= 20; i++) {
            lugares += i;
            //If para garantir que os numeros triangulares só imprimem o multiplo de 5 até 121 lugares
            if (lugares < 121) {
                if (lugares % 5 == 0) {
                    System.out.print(lugares + " ");
                    System.out.println();
                }
            }
        }
    }

    public static void menuCLIENTE3(String[][] matrizTotal) {
        int contador = 1;

        for (int i = 0; i < matrizTotal.length; i++) {
            for (int v = i+1; v < matrizTotal.length; v++) {
                if (matrizTotal[i][7].equals(matrizTotal[v][7])) {
                    contador++;
                }
            }

            if (contador < 2) {
                System.out.println(matrizTotal[i][7]);
            }
            contador = 1;
        }
    }

    public static void menuCLIENTE4(String[][] matrizTotal) {

    }



    //--------------------------------------------------------------------------------------------------
    //------------------------------------------MENU ADMIN----------------------------------------------
    //--------------------------------------------------------------------------------------------------

    /**
     * Funcao para input de menu do admin
     */
    public static void menuADMIN() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int i;

        System.out.println(" __________________________________ ");
        System.out.println("|---1. Base de dados---------------|");
        System.out.println("|---2. Vendas e Total--------------|");
        System.out.println("|---3. Lucro-----------------------|");
        System.out.println("|---4. Clientes--------------------|");
        System.out.println("|---5. Jogo Caro ou Cliente rico---|");
        System.out.println("|__________________________________|");

        System.out.println("Escolha o menu a aceder: ");
        i = input.nextInt();

        //Escolha da funcao para o menu a usar consoante o input de utilizador
        switch (i) {
            case 1:
                menuADMIN1(lerFicheiroParaMatriz("src/FichaPratica_PE/GameStart_V2.csv"));
                menuADMIN();
                break;
            case 2:
                menuADMIN2(lerFicheiroParaMatriz("src/FichaPratica_PE/GameStart_V2.csv"));
                break;
            case 3:
                menuADMIN3(lerFicheiroParaMatriz("src/FichaPratica_PE/GameStart_V2.csv"));
                break;
            case 4:
                menuADMIN4(lerFicheiroParaMatriz("src/FichaPratica_PE/GameStart_V2.csv"));
                break;
            case 5:
                menuADMIN5(lerFicheiroParaMatriz("src/FichaPratica_PE/GameStart_V2.csv"));
                break;

            //Caso o valor nao esteja entre 1 e 4, da reset ao menu.
            default:
                System.out.println("Escolha um menu válido!");
                System.out.println();
                menuADMIN();

        }

    }

    //---------------------------------------FUNCOES MENU ADMIN----------------------------------------

    /**
     * Menu que importa a matriz e a exporta para a consola
     *
     * @throws FileNotFoundException
     */
    public static void menuADMIN1(String[][] matrizTotal) throws FileNotFoundException {

        imprimirMatrizConsola(matrizTotal);

    }

    /**
     * Funcao que pega na matriz, imprime o comprimento em linhas para dar a quantidade e soma todas as linhas da coluna 8 (valor)
     *
     * @throws FileNotFoundException
     */
    public static void menuADMIN2(String[][] matrizTotal) throws FileNotFoundException {

        double totalvendas = 0;
        //
        for (int i = 0; i < matrizTotal.length; i++) {

            //Conversao da string para double
            totalvendas += Double.parseDouble(matrizTotal[i][8]);
        }
        System.out.println("Quantidade de jogos Vendidos: " + matrizTotal.length + " Total de jogos vendidos: " + formatar.format(totalvendas) + "€");
    }

    /**
     * Funcao que calcula 20% de cada linha da coluna 8 (valor), faz a soma delas todas
     *
     * @param matrizTotal
     * @throws FileNotFoundException
     */
    public static void menuADMIN3(String[][] matrizTotal) throws FileNotFoundException {

        double lucro = 0;

        for (int i = 0; i < matrizTotal.length; i++) {

            //Conversao da string para double
            lucro += Double.parseDouble(matrizTotal[i][8]) * 0.2;
        }
        System.out.println("Lucro: " + formatar.format(lucro) + "€");

    }

    /**
     * Funcao que procura o ID dado pelo utilizador e imprime o seu email nome e contacto
     * @param matrizTotal
     * @throws FileNotFoundException
     */
    public static void menuADMIN4(String[][] matrizTotal) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String nome="", numero = "", email = "";
        int id;


        System.out.println("Introduza o ID do cliente: ");
        id = input.nextInt();


        //Os ids da base de dados so vao ate 60, portanto se for maior que 60 pede input novamente
        while (id>60){
            System.out.println("O seu ID não consta na base de dados, insira-o de novo: ");
            id = input.nextInt();
        }
            //Percorre as linhas todas da matriz ate encontrar um id igual ao dado
        for (int i = 0; i < matrizTotal.length; i++) {
            if (id==Integer.parseInt(matrizTotal[i][1])) {
                nome = matrizTotal[i][2];
                numero = matrizTotal[i][3];
                email = matrizTotal[i][4];
            }
        }
        System.out.println("Dados do utilizador | Nome: " + nome + " | contacto: " + numero + " | E-mail: " + email);

    }


    /**
     * Funcao que verifica qual o jogo mais caro por que pessoas foi comprado e qual o seu preço
     * @param matrizTotal
     * @throws FileNotFoundException
     */
    public static void menuADMIN5(String[][] matrizTotal) throws FileNotFoundException{
        double maiorvalor=0;
        String jogo="";

        //Ciclo que vai comprar todos os valor e guardar o seu maior na variavel maiorvalor
        for (int i = 0; i<matrizTotal.length;i++){
            if (Double.parseDouble(matrizTotal[i][8])>maiorvalor){
                maiorvalor=Double.parseDouble(matrizTotal[i][8]);
            }
        }

        //Com a variavel a ter guardado já o maior valor, vai percorrer a tabela outra vez
        //e procurar o jogo naquele valor e guardar o seu nome numa string
        for (int i = 0; i<matrizTotal.length;i++){
            if (maiorvalor==Double.parseDouble(matrizTotal[i][8])){
                jogo=matrizTotal[i][7];
            }
        }

        //Mesmo procedimento do de cima mas agora para os clientes que compraram o jogo
        System.out.println("O jogo mais caro é o: "+jogo);
        System.out.println("Custa: "+maiorvalor+"€");
        System.out.println("Foi comprado por: ");
        for (int i = 0; i<matrizTotal.length;i++){
            if (maiorvalor==Double.parseDouble(matrizTotal[i][8])){
                System.out.println("-"+matrizTotal[i][2]);
            }
        }
    }


    //--------------------------------------------------------------------------------------------------
    //------------------------------------------CORACAO DO PROGRAMA AKA MATRIZ--------------------------
    //--------------------------------------------------------------------------------------------------

    /**
     * Funcao que retorna o número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Linhas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemLinhas = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contagemLinhas++;
        }

        return contagemLinhas;
    }

    /**
     * Funcao que retorna o número de colunas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Colunas Totais
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        int contagemColunas = 0;

        String linha = scanner.nextLine();
        String[] itensLinha = linha.split(delimitador);

        contagemColunas = itensLinha.length;

        return contagemColunas;
    }


    /**
     * Funcao que armazena numa matriz o conteudo de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Matriz String[][] preenchida com o conteudo
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {

        File ficheiro = new File(caminhoFicheiro);
        Scanner scanner = new Scanner(ficheiro);

        // Contar numero de linhas do ficheiro (excluindo o cabecalho)
        int numeroLinhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        // Contar número de colunas do ficheiro
        int numeroColunas = contarColunasFicheiro(caminhoFicheiro, ";");

        // Declarar uma matriz com o tamanho adequado
        String[][] matrizTotal = new String[numeroLinhas][numeroColunas];

        String linhaAtual = scanner.nextLine();
        int linhaMatriz = 0;

        while (scanner.hasNextLine()) {
            linhaAtual = scanner.nextLine();
            String[] itensLinha = linhaAtual.split(";");

            for (int i = 0; i < itensLinha.length; i++) {
                matrizTotal[linhaMatriz][i] = itensLinha[i];
            }

            linhaMatriz++;

        }

        return matrizTotal;
    }

    /**
     * Método para imprimir uma matriz na consola
     *
     * @param matriz Matriz a imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println();
        }
    }

}








