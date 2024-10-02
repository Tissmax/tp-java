package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(a[0]);
        System.out.println(a.length);
        System.out.println(a[a.length - 1]);
        a[4] = 8;
        System.out.println(a[4]);
    }
}
