package fr.approche_objets.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            entiers.add(i);
        }
        System.out.println(entiers.size());
    }
}
