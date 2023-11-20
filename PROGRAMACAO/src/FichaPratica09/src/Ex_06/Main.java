package Ex_06;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora01 = new Calculadora();

        calculadora01.adicao(32.3,43.0);
        calculadora01.sub(32,50);
        calculadora01.div(30,3);
        calculadora01.multi(50,5);

        System.out.println();

        calculadora01.multi(calculadora01.adicao(10,5),3);

    }
}
