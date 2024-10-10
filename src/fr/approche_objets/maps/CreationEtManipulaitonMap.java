package fr.approche_objets.maps;

import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulaitonMap {
    public static void main(String args[]) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
//TODO Développements à réaliser ci-dessous

        mapVilles.put(33, "Bordeaux");
        mapVilles.put(51, "Lille");
        mapVilles.put(77, "Lyon");
        Set<Integer> cles = mapVilles.keySet();
        for (Integer cle:cles){
            System.out.println(cle);
            System.out.println(mapVilles.get(cle));
        }
        System.out.println(mapVilles.size());
    }
}
