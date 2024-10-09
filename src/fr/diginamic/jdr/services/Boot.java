package fr.diginamic.jdr.services;

import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.utils.CreerEntite;
import fr.diginamic.jdr.utils.Input;

public class Boot {
    public static  void lancement(){

        System.out.println("Votre personnage à bien été créer!");
        int choix = Input.uInput();
        boolean isRunning = true;
        Personnage joueur = CreerEntite.personnage();
        int score = joueur.getScore();

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
                    score = Menu.combattre(joueur);
                        if (joueur.getPv()<=0){
                            System.out.println("Vous êtes mort, mais vos exploits resteront graver dans les mémoires");
                            System.out.println("Votre score est de "+ Menu.afficherScore(score));
                            System.out.println("Veuillez créer un nouveau personnage");
                            Menu.afficherMenu();
                        }
                    break;
                case 3:
                    Menu.afficherScore(score);
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
