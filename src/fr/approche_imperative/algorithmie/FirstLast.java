package fr.approche_imperative.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        boolean control = false;
        if (array.length >= 1 && array[0]== array.length-1) {
            control = true;
        }
    }
}
