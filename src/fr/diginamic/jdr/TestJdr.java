package fr.diginamic.jdr;

import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.services.Menu;
import fr.diginamic.jdr.utils.CreerEntite;
import fr.diginamic.jdr.utils.Input;
import fr.diginamic.jdr.utils.RandomGenerateur;

public class TestJdr {
    public static void main(String[] args) {
        Personnage joueur = CreerEntite.personnage();
        Menu.afficherMenu();
        System.out.println("Votre personnage à bien été créer!");
        int choix = Input.uInput();
        boolean isRunning = true;

        while (isRunning){
            switch (choix){
                case 1:
                    if (joueur.getPv()<0){
                        joueur = CreerEntite.personnage();
                        System.out.println("Votre personnage a été créer, c'est reparti pour l'aventure!");
                    } else {
                    System.out.println("Veuillez tuez votre personnage avant d'en créer un nouveau");
                }

                    break;
                case 2:
                    Menu.combattre(joueur);
                    break;
                case 3:
                    Menu.afficherScore(joueur.getScore());
                    break;
                case 4:
                    isRunning = Menu.sortir(isRunning);
                    System.out.println("Vous allez quittez le programme");
                    System.out.println("Appuyez sur n'importe quelle touche pour quitter");
                    break;
                default:
                    System.out.println("La commande est erronné, veuillez choisir une des commandes spécifiés");
            }
            choix = Input.uInput();
        }
    }
}
