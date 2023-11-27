package Ex_02;

public class Main {


    public static void main(String[] args) {


        Pessoa pessoa01 = new Pessoa("Jony", "asdsa@dasda.com", 12, 9329452);
        Pessoa pessoa02 = new Pessoa("Miclas", "Micals@adsa.com", 18, 932423);
        Pessoa pessoa03 = new Pessoa("Fany", "Fany@dasda.com", 19, 94234232);
        Pessoa pessoa04 = new Pessoa("Tobias", "Fany@dasda.com", 19, 94234232);


        Sorteio novosorteio = new Sorteio();


        novosorteio.addparticipante(pessoa01);
        novosorteio.addparticipante(pessoa02);
        novosorteio.addparticipante(pessoa03);
        novosorteio.addparticipante(pessoa04);

        System.out.println("");

        novosorteio.imprimircandidato();

        System.out.println("");


        novosorteio.sortear();
    }
}
