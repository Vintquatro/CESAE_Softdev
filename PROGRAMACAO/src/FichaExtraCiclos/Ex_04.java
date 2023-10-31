package FichaExtraCiclos;

public class Ex_04 {
    public static void main(String[] args) {

        String estrela = "*", arvore = "*", espaco = " ";
        int contador = 0, contador2 = 0, contaL = 0, contaC = 0;


        while (contador < 4) {
            System.out.println("*************");
            contador++;
        }

        System.out.println(" ");

        while (contador2 < 5) {
            System.out.println(estrela);
            estrela = estrela + "*";
            contador2++;
        }


        System.out.println("-------4.3-------- ");



        int linha;
        int espa=1;
        int ast;
        int counter;
        int asteriscoLinha=1;
        int espacoLinha=5;
        String arvnat = "", simetria = "";


        //cricao linha
        for (linha = 1; linha <= 5; linha++) {

            //criacao coluna e imprimir espacos
            for (espa=1; espa <= espacoLinha; espa++) {
                simetria += " ";
            }

            for (ast=1; ast <= asteriscoLinha ; ast++) {
                arvnat += "*";
            }

            System.out.println(simetria + arvnat);

            arvnat = "";
            simetria = "";
            asteriscoLinha+=2;
            espacoLinha--;




        }
    }
}


