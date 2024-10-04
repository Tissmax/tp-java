package fr.approche_imperative.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt();
        do {
            nb = scanner.nextInt();
        } while (nb < 0 && nb > 10);
    }
}
