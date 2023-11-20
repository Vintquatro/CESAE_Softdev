package Ex_07;

public class Livro {

    private String titulo,autor,categoria,isbn;
    private int paginas;


    public Livro(String titulo, String autor, String categoria, String isbn, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
        this.paginas = paginas;
    }






    public void exibirdetalhes(){

        System.out.println(this.titulo+" "+this.autor+" "+this.categoria+" "+this.isbn+" "+this.paginas);
    }
}
