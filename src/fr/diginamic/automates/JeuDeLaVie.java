package fr.diginamic.automates;

import fr.diginamic.automates.entites.Cell;
import fr.diginamic.automates.services.Map;
import fr.diginamic.automates.services.Menu;
import fr.diginamic.automates.services.PatternReader;


import java.util.HashMap;

public class JeuDeLaVie {
    public static void main(String[] args) throws Exception{
        //Initialisation du programme
        //Le pattern est transformé en map lisible par la console
        HashMap<Integer, String> init = PatternReader.lecturePattern(Menu.start());
        System.out.println("Génération 1");
        HashMap<Integer, String> map = Cell.vieOuMort(init);
        Thread.sleep(Menu.intervalleGene);
        //Le jeux tourne autant de fois que spécifier par l'utilisateur.
        if (Menu.nbGeneration!=0){
            for (int i = 0; i < Menu.nbGeneration; i++) {
                System.out.println("Génération"+(i+2));
                //Génération d'une nouvelle map
                map = Cell.vieOuMort(map);
                Map.genererMap(map);
                Thread.sleep(Menu.intervalleGene);
            }
        }
        int i = 1;
        //Le jeux tourne à l'infinie.
        while (Menu.isRunning(Menu.nbGeneration)){
            System.out.println("Génération"+i);
            i++;
            //Génération d'une nouvelle map
            map = Cell.vieOuMort(map);
            Map.genererMap(map);
            Thread.sleep(Menu.intervalleGene);
        }
    }
}
