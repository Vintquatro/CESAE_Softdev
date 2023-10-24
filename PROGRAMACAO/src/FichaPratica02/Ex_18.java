package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double venciDia, subAli, irs, salBruto, ss, valLiquido;
        int codFunc, diasTrab;

        System.out.print("Insira o seu codigo de funcionario: ");
        codFunc= input.nextInt();

        System.out.print("Insira o numero de dias trabalhados este mes: ");
        diasTrab= input.nextInt();

        // SALARIO e SUBSIDIO
        salBruto = diasTrab*40;
        subAli = diasTrab*5;

        irs=salBruto * 0.11;
        ss=salBruto*0.3375;

        valLiquido= salBruto+subAli-irs-ss ;

        System.out.println("IRS: "+ irs);
        System.out.println("Seguranca Social: "+ ss);
        System.out.println("Salario Bruto:" + salBruto+subAli);
        System.out.println("Subsidio Alimentacao: " + subAli);
        System.out.println("Salario Liquido "+ valLiquido);



    }
}
