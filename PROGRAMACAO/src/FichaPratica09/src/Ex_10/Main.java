package Ex_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Funcionario funcionario01 = new Funcionario("Joaozinho","Fincancas",700);

        funcionario01.exibirdados();


        System.out.println("Insira o aumento em percentage: ");
        double aumentototal = input.nextDouble();
        aumentototal/=100;
        funcionario01.aumentarsalario(aumentototal);
        funcionario01.exibirdados();
    }
}
