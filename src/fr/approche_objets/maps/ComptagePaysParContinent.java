package fr.approche_objets.maps;

import java.util.*;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        List<Pays> pays = new ArrayList<>();
        Collections.addAll(pays,
                new Pays("France", "65 millions d’habitants","Europe"),
                new Pays("Allemagne", "80 millions d’habitants","Europe"),
                new Pays("Belgique", "10 millions d’habitants","Europe"),
                new Pays("Russie", "150 millions d’habitants","Asie"),
                new Pays("Chine", "1.4 milliards d’habitants","Asie"),
                new Pays("Indonésie", "220 millions d’habitants","Océanie"),
                new Pays("Australie", "20 millions d’habitants","Océanie")
        );
        HashMap<String, Integer> nPaysContinents = new HashMap<>();

        for (Pays cePays:pays){
            if (cePays.continent.equals("Europe")){
                nPaysContinents.put(cePays.getNom(), 1);
            }
            if (cePays.continent.equals("Asie")){
                nPaysContinents.put(cePays.getNom(), 2);
            }
            if (cePays.continent.equals("Océanie")){
                nPaysContinents.put(cePays.getNom(), 3);
            }
        }
        Set<String> cles = nPaysContinents.keySet();
        int nOceanie=0;
        int nAsie=0;
        int nEurope=0;
        for (String cle:cles){
            if (nPaysContinents.get(cle)==1){
                nEurope++;
            }
            if (nPaysContinents.get(cle)==2){
                nAsie++;
            }
            if (nPaysContinents.get(cle)==3){
                nOceanie++;
            }
        }
        System.out.println(nEurope+" "+nAsie+" "+nOceanie);
    }
}
