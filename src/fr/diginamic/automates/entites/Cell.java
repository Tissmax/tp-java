package fr.diginamic.automates.entites;

import fr.diginamic.automates.services.Map;

import java.util.HashMap;
import java.util.Set;

public class Cell {

    public static HashMap<Integer, String> vieOuMort(HashMap<Integer, String> map) {
        //Création d'une copie de map pour stocker les modifications
        //Si on utilise la map passée en argument le programme ne marchera pas
        HashMap<Integer, String> mapCopy = new HashMap<>();
        Set<Integer> cles = map.keySet();
        for (Integer cle:cles){
            mapCopy.put(cle,map.get(cle));
        }
        int nbVivants = 0;
        for (int i = 0; i < map.size(); i++) {
            //Lecture de la map et affectation des variable permettant de voir les cellules adjacentes
            String hautGauche = map.get(i - Map.COLS - 1);
            String hautDroite = map.get(i - Map.COLS + 1);
            String haut = map.get(i - Map.COLS);
            String basGauche = map.get(i + Map.COLS - 1);
            String basDroite = map.get(i + Map.COLS + 1);
            String bas = map.get(i + Map.COLS);
            String gauche = map.get(i - 1);
            String droite = map.get(i + 1);
            //Rangement dans un tableau pour faciliter la manipulation
            String[] alentour = {hautGauche, hautDroite, haut, basGauche, basDroite, bas, gauche, droite};
            //Valorisation de nbVivants pour retrouver le nombre de cellules autour de la cellule courante
            for (String pos : alentour) {
                if (pos != null) {
                    if (pos.equals("X")) {
                        nbVivants++;
                    }
                }
            }
            //Mort
            if (nbVivants >= 4 || nbVivants < 2) {
                if (map.get(i).equals("X")) {
                    mapCopy.put(i, " ");
                }
            }
            //Naissance
            if (nbVivants == 3) {
                if (map.get(i).equals(" ")) {
                    mapCopy.put(i, "X");
                }
            }
            //Pas besoin de programmer la vie d'une cellule, les conditions ci-dessus permettent
            //de faire cette vérification
            nbVivants=0;
        }
        return mapCopy;
    }
}
