package Pessoas;

abstract class Pessoas {
    private String nome, email, telemovel;
    private int anoNascimento;

    public Pessoas(String nome, String email, String telemovel, int anoNascimento) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.anoNascimento = anoNascimento;
    }


    public abstract void obterfuncao();



    public void exibirdetalhes(){
        System.out.println(this.nome);
        System.out.println(this.anoNascimento);
        System.out.println(this.telemovel);
        System.out.println(this.email);
    }


    public abstract void imprimirhorario();

}
