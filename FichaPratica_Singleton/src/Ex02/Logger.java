package Ex02;

import java.io.*;

public class Logger {

    private String nome;
    private static Logger instance;

    private Logger(String nome) {
        this.nome = nome;
    }

    public static Logger getInstance(String nome){

        if (instance==null){
            instance= new Logger(nome);
        }
        return instance;
    }

    public void log(String texto) throws IOException {

        FileWriter printWriter= new FileWriter(nome,true);

        printWriter.append(texto+"\n");
        printWriter.close();

    }



}
