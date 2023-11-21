package Ex_02;

public class Conta {
    private int numeroconta,anoabertura=2023;
    private double saldo,margememprestimo,divida;
    private String titular;


    public Conta(int numeroconta, double saldo, String titular) {
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.titular = titular;
    }


    public void transferencia(Conta destinataria,double valortransferencia){
        this.saldo-=valortransferencia;
        destinataria.saldo+=valortransferencia;
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


    public void emprestimo(double quantidadeemprestimo) {
        double emprestimo;
        System.out.println(this.divida);
        emprestimo = this.saldo * 0.9;

        if (this.divida <= 0) {
            if (quantidadeemprestimo > emprestimo) {
                System.out.println("Emprestimo Impossivel");
            } else {
                this.divida=quantidadeemprestimo;
                this.saldo+=quantidadeemprestimo;
                System.out.println("Saldo: "+this.saldo+" Divida: "+this.divida);
            }
        }else {
            System.out.println("Pague as suas dividas caloteiro antes de pedir emprestimos");
        }
    }


    public void saldoconta(){
        System.out.println("SALDO CONTA "+this.titular+": "+this.saldo+" EUR");
    }

}
