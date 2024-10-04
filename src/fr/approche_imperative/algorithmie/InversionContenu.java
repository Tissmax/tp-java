package fr.approche_imperative.algorithmie;

import java.util.Arrays;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayCopy.length/2; i++) {
            int a = arrayCopy[i];
            arrayCopy[i] = arrayCopy[arrayCopy.length-i-1];
            arrayCopy[arrayCopy.length-i-1] = a;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
