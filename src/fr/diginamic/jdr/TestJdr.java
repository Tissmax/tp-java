package fr.diginamic.jdr;

import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.services.Menu;
import fr.diginamic.jdr.utils.CreerEntite;
import fr.diginamic.jdr.utils.Input;

public class TestJdr {
    public static void main(String[] args) {

        Personnage joueur = CreerEntite.personnage();
        Menu.afficherMenu();;
        boolean isRunning = true;
        int choix = Input.uInput();
        switch (choix){
            case 1:
                if (joueur.getPv()<0){
                    joueur = CreerEntite.personnage();
                    System.out.println("Votre personnage a été créer, c'est reparti pour l'aventure!");
                }
                if (joueur.getPv()>0){
                    System.out.println("Veuillez tuez votre personnage avant d'en créer un nouveau");
                }
            case 2:
                Menu.combattre();
            case 3:
                Menu.afficherScore(joueur.getScore());
            case 4:
                Menu.sortir(isRunning);
            default:

        }
    }
}
