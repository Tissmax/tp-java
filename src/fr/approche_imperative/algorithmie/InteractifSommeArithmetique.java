package fr.approche_imperative.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt();
        int somme = 0;
        for (int i = 0; i <= nb; i++) {
            somme += i;
        }
        System.out.println(somme);
    }
}
