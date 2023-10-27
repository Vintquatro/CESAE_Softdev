package FichaPratica03;

public class Ex_06 {

    public static void main(String[] args) {

        int num=1,soma=0;

        while (num >=1 && num<=100){

            System.out.println(num);
            soma=soma+num;
            num++;
        }
        System.out.println("somatorio: "+soma);
    }


}
