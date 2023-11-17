package Ex_02;

public class Main {


    public static void main(String[] args) {

    Cao Charuto = new Cao("Charuto","Labrador");
    Cao Chouricas = new Cao("Chouricas","Rafeiro");
    Cao Pele = new Cao("Pele","Falecido");

        System.out.println(Charuto.getNome());
        System.out.println(Charuto.getRaca());
        Charuto.ladrar();

        System.out.println();

        Chouricas.setLatido("Meow Meow");
        System.out.println(Chouricas.getNome());
        System.out.println(Chouricas.getRaca());
        Chouricas.ladrar();

        System.out.println();

        Pele.setLatido("*crickets*");
        System.out.println(Pele.getNome());
        System.out.println(Pele.getRaca());
        Pele.ladrar();




    }
}
