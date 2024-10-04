package fr.approche_imperative.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        double randomNb = Math.random()*100;
        randomNb = Math.round(randomNb);
        Scanner scanner = new Scanner(System.in) ;
        int nbUser = 101;
        int nbCoup = 1;
        while (nbUser != randomNb) {
            nbUser = scanner.nextInt();
            if (nbUser > randomNb) {
                System.out.println("Votre nombre est trop grand");
                nbCoup ++;
            }
            if (nbUser < randomNb) {
                System.out.println("Votre nombre est trop petit");
                nbCoup ++;
            }
            if (nbUser == randomNb) {
                System.out.println("Bravo, vous avez trouvez en " + nbCoup + " coups");
            }
        }
    }
}
