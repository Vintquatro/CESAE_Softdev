package Ex02;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance("C:\\Users\\diogo\\Desktop\\CESAE_SoftDev\\FichaPratica_Singleton\\textoteste.txt");
        logger.log("TESTE 123");
        logger.log("ola");

    }
}
