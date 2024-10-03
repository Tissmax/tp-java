package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userStart = false;
        System.out.println("Tapez 1 pour commencer\nTapez 2 pour laisser l'ordinateur commencer");
        int choix =  scanner.nextByte();
        boolean initBoucle = true;
        /*L'utilisateur peut choisir de laisser l'ordianteur commncer*/
        do {
            switch (choix) {
                case 1:
                    userStart = true;
                    System.out.println("Vous avez choisi de commencer la partie saissez un chiffre pour retirer un baton");
                    initBoucle = false;
                    break;
                case 2:
                    System.out.println("Vous avez laissez l'ordinateur commencer saissez un chiffre pour retirer un baton");
                    initBoucle = false;
                    break;
                default:
                    System.out.println("Choix incorrect");
                    choix = scanner.nextByte();
                    break;
            }

        } while (initBoucle);
        choix =  scanner.nextByte();
        initBoucle = true;
        int batons = 21;
        /*L'utilisateur commence*/
        if (userStart) {
            do {
                batons--;
                System.out.println("Vous avez retirez un baton");
                if (batons == 0) {
                    System.out.println("Vous avez perdu");
                    break;
                }
                System.out.println("L'ordinateur a retirée un baton");
                batons--;
                if (batons == 0) {
                    System.out.println("Vous avez gagné !");
                    break;
                }
                choix =  scanner.nextByte();
            } while (batons > 0);
            /*L'ordinateur commence*/
        } else {
            do {
                batons--;
                System.out.println("L'ordinateur a retirée un baton");
                if (batons == 0) {
                    System.out.println("Vous avez gagné !");
                    break;
                }
                batons--;
                System.out.println("Vous avez retirez un baton");
                if (batons == 0) {
                    System.out.println("Vous avez perdu");
                    break;
                }
                choix =  scanner.nextByte();
            } while (batons > 0);
        }
    }
}




