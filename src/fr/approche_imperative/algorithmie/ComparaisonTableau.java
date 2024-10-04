package fr.approche_imperative.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        byte similitude = 0;
        for (int k : array2) {
            for (int i : array1) {
                if (k == i) {
                    similitude += 1;
                }
            }
        }
        System.out.println(similitude);
    }
}
