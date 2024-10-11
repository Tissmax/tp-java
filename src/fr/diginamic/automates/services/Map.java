package fr.diginamic.automates.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Cette classe permet de générer une liste de String a partir de la map passer en paramètre

public class Map {

    public static final int COLS = 30;
    public static final int ROWS = 12;

    public static void genererMap(HashMap<Integer, String> map){

        List<String> lignes = new ArrayList<>();
        for (int i = 0; i < ROWS; i++) {
            StringBuilder s = new StringBuilder("|");
            for (int j = 0; j < COLS; j++) {
                int pos = j+(COLS*i);
                if (map.get(pos)!=null) {
                    s.append(map.get(pos)).append("|");
                }
            }
          lignes.add(s.toString());
        }
        System.out.println(map.get(0));
        for (String ligne:lignes){
            System.out.println(ligne);
        }
    }
}
