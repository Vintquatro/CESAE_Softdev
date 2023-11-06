package FichaExtraArrays;

import java.util.Random;

public class Ex_02 {
    public static void main(String[] args) {
        int[] myArray = new int[14];

        for (int i = 0; i < 14; i++) {
            myArray[i] = new Random().nextInt(0, 100);
            System.out.println("array: " + myArray[i]);
        }

        for (int i = 13; i >= 0; i--) {
            System.out.println("Reverse Array: " + myArray[i]);
        }
    }
}

