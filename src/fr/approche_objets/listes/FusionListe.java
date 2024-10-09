package fr.approche_objets.listes;

import java.util.ArrayList;

public class FusionListe {
    public static void main(String args[]) {
        ArrayList<String> liste1 = new ArrayList<>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<>();
        for (String str : liste1){
            liste3.add(str);
        }
        for (String str : liste2){
            liste3.add(str);
        }
        System.out.println(liste3);
    }
}
