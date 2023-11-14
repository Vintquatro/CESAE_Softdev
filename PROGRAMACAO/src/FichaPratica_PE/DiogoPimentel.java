package FichaPratica_PE;

import java.util.Scanner;

import static FichaPratica_PE.LibrariaFuncoes.bemvindo;
import static FichaPratica_PE.LibrariaFuncoes.menuUtilizador;

public class DiogoPimentel {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        //Chamada do grafismo inicial
        bemvindo();

        


        //Chamada da funcao do menu de login
        String utilizador="";
        menuUtilizador(utilizador);


    }




}
