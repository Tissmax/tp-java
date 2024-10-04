package fr.approche_imperative.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt();
        while (true) {
            if (nb >= 0 && nb <= 10) {
                System.out.println("Table de " + nb);
                System.out.println(nb + " * 1 =" + nb);
                System.out.println(nb + " * 2 =" + nb * 2);
                System.out.println(nb + " * 3 =" + nb * 3);
                System.out.println(nb + " * 4 =" + nb * 4);
                System.out.println(nb + " * 5 =" + nb * 5);
                System.out.println(nb + " * 6 =" + nb * 6);
                System.out.println(nb + " * 7 =" + nb * 7);
                System.out.println(nb + " * 8 =" + nb * 8);
                System.out.println(nb + " * 9 =" + nb * 9);
                System.out.println(nb + " * 10 =" + nb * 10);
                break;
            }
            System.out.println("Le nombre doit être compris entre 0 et 10");
            nb = scanner.nextInt();
        }
    }
}
