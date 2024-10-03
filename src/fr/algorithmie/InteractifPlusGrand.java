package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int max = 0;
        int nb = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int chiffrePrecedent = nb;
             nb = scanner.nextInt();
            if (chiffrePrecedent < nb) {
                max = nb;
            }
        }
        System.out.println("Le nombre le plus grand est " + max);
    }
}
