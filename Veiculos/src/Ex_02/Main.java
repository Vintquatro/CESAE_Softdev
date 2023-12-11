package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static Veiculos criarveiculo(){

        String marca1,modelo1;
        int veiculo1,ano1,potencia1,cilindrada1, consumo1,tipogota1,passageiros;
        TipoGota tipogota_enum = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o tipo de veiculo que  pretender encomendar: ");
        System.out.println("1. Mota");
        System.out.println("2. Carro");
        System.out.println("3. Camiao");


        veiculo1 = input.nextInt();

        System.out.println("Introduza os dados do seu veiculo: ");
        System.out.println("Marca: ");
        marca1= input.next();
        System.out.println("Modelo: ");
        modelo1=input.next();
        System.out.println("Ano: ");
        ano1=input.nextInt();
        System.out.println("Cilindrada: ");
        cilindrada1=input.nextInt();
        System.out.println("Potencia: ");
        potencia1=input.nextInt();
        System.out.println("Consumo: ");
        consumo1=input.nextInt();

        System.out.println("Tipo de combustivel: ");
        System.out.println("1. Gasolina | 2. Diesel | 3. GPL | 4. Eletrico");
        tipogota1=input.nextInt();

        switch (tipogota1){
            case 1:
                tipogota_enum= TipoGota.GASOLINA;
                break;
            case 2:
                tipogota_enum= TipoGota.DIESEL;
                break;
            case 3:
                tipogota_enum= TipoGota.GPL;
                break;
            case 4:
                tipogota_enum= TipoGota.ELETRICO;
                break;
            default:

        }


        switch (veiculo1){
            case 1:
                Mota mota01 = new Mota(marca1,modelo1,ano1,potencia1,cilindrada1,consumo1,tipogota_enum);
                return mota01;
            case 2:
                System.out.println("Numero passageiros: ");
                passageiros= input.nextInt();
                Carro carro01 = new Carro(marca1,modelo1,ano1,potencia1,cilindrada1,consumo1,tipogota_enum,passageiros);
                return carro01;
            case 3:
                int cargacamiao;
                System.out.println("Carga Camiao");
                cargacamiao=input.nextInt();
                Camiao camiao01 = new Camiao(marca1,modelo1,ano1,potencia1,cilindrada1,consumo1,tipogota_enum,cargacamiao);
                return camiao01;
            default:
                return null;
        }



    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        Veiculos veiculo1 = criarveiculo();





        veiculo1.exibirDetalhes();
        System.out.println("");



        int menu;
        System.out.println("1. Calcular Consumo ");
        System.out.println("2. Fazer corrida contra Carro");
        System.out.println("3. Fazer corrida contra Mota");
        System.out.println("4. Fazer corrida contra Camiao");
        System.out.println("5. Custos viagem de Camião");
        System.out.println("6. Ilustracao Mota");


        menu = input.nextInt();
        switch (menu){
            case 1:
                System.out.println("Introduza os KMs para uma simulacao de viagem/consumo: ");
                int kms;
                kms= input.nextInt();
                veiculo1.consumo100(kms);
                break;

            case 2:
                Carro carro_BOT = new Carro("Fiat","Punto",2000,500,600,7,TipoGota.GASOLINA,4);
                veiculo1.corrida(carro_BOT);
                break;
            case 3:
                Mota mota_BOT = new Mota("Kawsaki","Ninja",2015,600,800,5,TipoGota.GASOLINA);
                veiculo1.corrida(mota_BOT);
                break;
            case 4:
                Camiao camiao_BOT = new Camiao("Rednecker","Murica",2023,850,400,20,TipoGota.GASOLINA,5000);
                veiculo1.corrida(camiao_BOT);
                break;
            case 5:
                if (veiculo1 instanceof Camiao){
                    Camiao camiao_teste = (Camiao) veiculo1;

                    System.out.println("Insira a distancia: ");
                    double distancia,carga;
                    distancia= input.nextDouble();
                    System.out.println("Insira a carga");
                    carga=input.nextDouble();
                    camiao_teste.calcularviagem(distancia,carga);
                }
                break;
            case 6:
                if (veiculo1 instanceof Mota){
                 Mota mota_teste = (Mota) veiculo1;
                 mota_teste.imprimirmota();
                }

                break;
            default:

        }


        

       /* Camiao camiao_01 = new Camiao("Renault","Sprinter",2020,210,4500,10,TipoGota.DIESEL,1000);
        Carro carro_01 = new Carro("Fiat","Punto",2000,500,600,7,TipoGota.GASOLINA,4);
        Carro carro_02 = new Carro("Fiat","500",2002,501,601,7,TipoGota.GASOLINA,4);

        Mota mota_01 = new Mota("Kawsaki","Ninja",2015,600,800,5,TipoGota.GASOLINA);

        carro_01.corrida(carro_02);

        System.out.println("");
        camiao_01.exibirDetalhes();
        System.out.println("");

        mota_01.corrida(camiao_01);
        camiao_01.calcularviagem(500,100);


        System.out.println("");

        carro_01.calcularcusto(150);

        System.out.println("");

        camiao_01.calcularviagem(1001,500);
*/



    }
}
