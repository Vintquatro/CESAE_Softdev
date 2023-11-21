package Ex_02;

public class Main {

    public static void main(String[] args) {
        Conta conta_Jose = new Conta(123456,10000,"Jose Repolho");
        Conta conta_Quim = new Conta(2345,11000,"Quim Bolas");
        Conta conta_Laurindinha = new Conta(25345,500,"Laurindinha Pimpolha");

        conta_Jose.depositar(1000);
        conta_Jose.saldoconta();

        conta_Jose.levantar(120);
        conta_Jose.saldoconta();


        conta_Quim.transferencia(conta_Laurindinha,500);
        conta_Quim.saldoconta();
        conta_Laurindinha.saldoconta();



        conta_Jose.emprestimo(10000);


    }
}
