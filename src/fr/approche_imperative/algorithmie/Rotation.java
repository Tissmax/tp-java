package fr.approche_imperative.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10};
        int premier = array[0];
        int dernier = array[array.length-1];;
        array[0] = dernier;
        array[array.length-1] = premier;
        System.out.println(Arrays.toString(array));
    }
}
