package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb = scanner.nextInt();
        while (nb < 1 && nb > 10) {
            scanner = new Scanner(System.in) ;
            nb = scanner.nextInt();
        }
    }
}
