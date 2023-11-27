package Ex_05;

public class Main {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Joaozinho","dasda@asda.com",25,93294523);
        Pessoa pessoa2 = new Pessoa("Maria Repolho","dasda@asda.com",25,93294523);

        Agenda novaagenda = new Agenda();

        novaagenda.adicionarpessoas(pessoa1);

        novaagenda.listarpessoas();


    }
}
