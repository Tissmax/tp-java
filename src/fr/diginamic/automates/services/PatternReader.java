package fr.diginamic.automates.services;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Cette classe prend un pattern.csv et retourne une map, contenant les cellules rangées une par une.
//Elle imprime aussi le pattern dans la console.

public class PatternReader {

    public static HashMap<Integer, String> lecturePattern(String pattern)throws Exception{
        //Création du chemin relatif à la demande de l'utilisateur
        Path path = Paths.get("/home/tiss/Bureau/Projets/tp-java/src/fr/diginamic/automates/patterns/"+pattern+".csv/");
        //Lecture du pattern renvoyée en csv
        List<String> cells = Files.readAllLines(path);
        //Map qui stock toutes les cellules avec leur indice respectif
        HashMap<Integer, String> listeCell = new HashMap<>();
        //Liste qui contient les différents String pour construire l'image
        List<String> lignes = new ArrayList<>();

        //Algorithme simple qui permet de construire les lignes du pattern donné et la map
        //Chaque cellule est analysé et concatener à l'aide d'un StringBuilder
        //Chaque cellule est rangé avec son indice dans la map
        int key = 0;

        for (int i = 0; i < Map.ROWS; i++) {
            String cell = cells.get(i);
            String[] tokens = cell.split(";");
            StringBuilder s = new StringBuilder("|");
            for (int j = 0; j < Map.COLS; j++) {
                s.append(tokens[j]).append("|");
                listeCell.put(key, tokens[j]);
                key++;
            }
            lignes.add(s.toString());
        }
        //Affichage de l'image
        for (String ligne:lignes){
            System.out.println(ligne);
        }
        System.out.println();
        return listeCell;
    }
}
