package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InbteractifStockageNombre {
    public static void main(String[] args) {
        System.out.println("Pour ajoutez un nombre, tapez 1\nPour voir les nombres existants, tapez 2\nPour arrêter le programme tapez 3");
        Scanner scanner = new Scanner(System.in) ;
        int selection = scanner.nextInt();
        int[] array = {};
        /*Vérification du choix de l'utilisateur, si le choix n'est pas 1 ou 2 le programme
        redemande à l'utilisateur de choisir l'option voulu*/
        do {
            if (selection == 1){
                System.out.println("Veuillez entrer le nombre que vous souhaitez ajouter");
                int nbUser = scanner.nextInt();
                /*On déclare 2 tableaux qui stock temporairement les valeurs de notre tableau finale et la valeur a ajouter*/
                int []arrayTemp1 = array;
                int[] arrayTemp2 = {nbUser};
                /*On recréer la variable array avec une case en plus*/
                array = new int[array.length + 1];
                /*On boucle dans les deux tableau temporaire et on copie chacune des valeurs au position voulu dans array*/
                int posTableau = 0;
                for (int i : arrayTemp1) {
                    array[posTableau] = i;
                    posTableau++;
                }
                for (int i : arrayTemp2) {
                    array[posTableau] = i;
                    posTableau++;
                }
                /*Menu de selection*/
                System.out.println("Votre nombre a bien été enregistrer");
                System.out.println("Pour ajoutez un nombre, tapez 1\nPour voir les nombres existants, tapez 2\nPour arrêter le programme tapez 3");
                selection = scanner.nextInt();

            } else if (selection == 2) {
                /*Affichage du contenu du tableau dans la console*/
                System.out.println(Arrays.toString(array));
                /*Menu de selection*/
                System.out.println("Pour ajoutez un nombre, tapez 1\nPour voir les nombres existants, tapez 2\nPour arrêter le programme tapez 3");
                selection = scanner.nextInt();
            } else if (selection == 3) {
                /*Message précédent l'arrêt du programme*/
                System.out.println("Arrêt");
            } else {
                /*Message d'erreur pour le cas ou l'utilisateur fait une erreur de frappe*/
                System.out.println("Erreur : Le chiffre rentré ne correspond à aucun des choix possible");
                selection = scanner.nextInt();
            }
        } while (selection != 3);
/*On arrête le programme*/
    }
}
