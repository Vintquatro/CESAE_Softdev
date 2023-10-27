package FichaPratica03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num,jump,count=0;

        System.out.println("num:");
        num= input.nextInt();
        System.out.println("jump: ");
        jump=input.nextInt();


        while (count<num){

            System.out.println(count);
            count=count+jump;
        }
    }
}
