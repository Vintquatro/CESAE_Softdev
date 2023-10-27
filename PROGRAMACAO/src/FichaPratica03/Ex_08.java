package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        int num,media=0, mediacounter=0;

        System.out.println("media: ");
        num=input.nextInt();

        while (num != -1){
            mediacounter++;
            media=media+num;

            System.out.println("media: ");
            num=input.nextInt();

        }

        System.out.println("media total: " +(media/mediacounter));
    }
}
