package Ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta Arnold = new Atleta("Arnold Shwazerneger","Powerlifting","USA",1.85,130);
        Atleta Joazinho= new Atleta("Joaozinho Grosso","Powerlifting","Tuga",1.50,60);
        Atleta Samuel = new Atleta("Samuel Massas", "Powerlifting","Tuga",1.76,80);
        Atleta Sonia = new Atleta("Sonia Araujo","Natacao","Suecia",1.55,60);
        Atleta Greta = new Atleta("Greta Ambientalista","Natacao","Finlandia",1.40,55);
        Atleta John = new Atleta("John Rato","Sprint 100m","Tuga",167,73);

        Competicao powerlifting = new Competicao("Powerlifting","Antartida");
        Competicao natacao = new Competicao("Natacao","Egipto");

        powerlifting.addatleta(Joazinho);
        powerlifting.addatleta(Arnold);
        powerlifting.addatleta(Samuel);
        natacao.addatleta(Greta);
        natacao.addatleta(Sonia);
        natacao.addatleta(John);

        natacao.listaratletas();
    }

}
