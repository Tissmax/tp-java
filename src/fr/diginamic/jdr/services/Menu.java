package fr.diginamic.jdr.services;

import fr.diginamic.jdr.utils.CreerEntite;
import fr.diginamic.jdr.utils.Input;

public class Menu {

    public static void afficherMenu(){
        System.out.println("1. Nouveau personage");
        System.out.println("2. Combattre");
        System.out.println("3. Afficher votre score");
        System.out.println("4. Sortir");
    }

    public static void combattre(){

    }

    public static void afficherScore(int score){
        System.out.println(score);
    }

    public static boolean sortir(boolean a){
        return a = false;
    }

}
