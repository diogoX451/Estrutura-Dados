package aula1;

import java.util.Arrays;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // int[] array = new int[5];
        // array[0] = 1;
        // array[1] = 2;
        // array[2] = 34;
        // array[3] = 35;
        // array[4] = 36;
        // System.out.println(Arrays.toString(array));

        int[] array = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                System.out.println("Achei o 4!");
            }
        }
    }
}