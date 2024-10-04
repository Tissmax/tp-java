package fr.approche_imperative.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un nombre de rang N");
        int n = scanner.nextInt();
        int nbN1 = 1;
        int nbN2 = 0;
        int somme = 0;
        if (n <= 1) {
            System.out.println(n);
        }
        for (int i = 0; i < n; i++) {
            somme = nbN1 + nbN2;
            nbN2 = nbN1;
            nbN1 = somme;
        }
        System.out.println(somme);
    }

}
