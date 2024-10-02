package fr.algorithmie;

public class SommeDeTableauDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
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
