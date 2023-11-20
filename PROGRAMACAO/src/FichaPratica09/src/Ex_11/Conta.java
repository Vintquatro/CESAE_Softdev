package Ex_11;

import java.util.Scanner;

public class Conta {

    private int numeroconta;
    private double saldo;
    private String titular;


    public Conta(int numeroconta, double saldo, String titular) {
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public void transferencia(double valortransferencia){
        Scanner input = new Scanner(System.in);
        String transfer="";
        System.out.println("Titular para a transferencia: ");
        transfer=input.next();

        this.saldo-=valortransferencia;
        return;
    }

    public void depositar(double valordeposito){
        this.saldo+=valordeposito;
    }

    public void levantar(double valorlevantamento){
        if (this.saldo-valorlevantamento<0) {
            System.out.println("Operacao Impossivel");
        }else{
            this.saldo-=valorlevantamento;
        }

    }

    public void saldoconta(){
        System.out.println("SALDO CONTA: "+this.saldo+" EUR");
    }


}
