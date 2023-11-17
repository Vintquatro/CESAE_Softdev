package Ex_02;

public class Cao {

    private String nome;
    private String raca;
    private String latido;

    Cao(String nome, String raca){
        this.nome=nome;
        this.raca=raca;
        this.latido= "Au Au Au";
    }


    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void ladrar(){
        System.out.println(latido);
    }

}
