package fr.algorithmie;

public class SommDeTableaux {
    public static void main(String[] args) {
        int[]array1 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int[] array2 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int somme = 0;
        for (int j : array1) {
            somme += j;
        }
        for (int j : array2) {
            somme += j;
        }
        System.out.println(somme);
    }
}
