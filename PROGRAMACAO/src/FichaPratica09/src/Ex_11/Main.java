package Ex_11;

public class Main {

    public static void main(String[] args) {

        Conta conta_Jose = new Conta(123456,10000,"Jose Repolho");
        Conta conta_Quim = new Conta(2345,11000,"Quim Bolas");


        conta_Jose.depositar(1000);
        conta_Jose.saldoconta();

        conta_Jose.levantar(120);

        conta_Jose.saldoconta();




    }
}
