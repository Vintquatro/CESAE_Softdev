package FichaExtraCiclos;

public class Ex_04 {
    public static void main(String[] args) {

        String estrela="*",arvore="*",espaco=" ";
        int contador=0,contador2=0,contaL=0,contaC=0;


        while (contador<4){
            System.out.println("*************");
            contador++;
        }

        while (contador2<5){
            System.out.println(estrela);
            estrela=estrela+"*";
            contador2++;
            }

        while (contaL<5){
            while (contaC<5){
                espaco=espaco+" ";
                contaC++;
            }
            contaL++;
        }

        }
    }



    /* switch (contador2){
                case 1:
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("**");
                    break;
                case 3:
                    System.out.println("***");
                    break;
                case 4:
                    System.out.println("****");
                    break;
                case 5:
                    System.out.println("*****");
                    break; */