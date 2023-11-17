package Ex_01;

public class Main {

    public static void main(String[] args) {
        Pessoa diogo= new Pessoa("Diogo.P",29,1.85);
        Pessoa francisca = new Pessoa("Francisca.A",25,1.6);


        System.out.println("Nome:" +diogo.getNome());
        System.out.println("Idade:"+diogo.getIdade());
        System.out.println("Altura:"+diogo.getAltura());


        System.out.println("");

        francisca.setIdade(22);

        System.out.println("Nome:" +francisca.getNome());
        System.out.println("Idade:"+francisca.getIdade());
        System.out.println("Altura:"+francisca.getAltura());


    }
}
