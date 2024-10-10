package fr.approche_objets.maps;

import fr.approche_objets.listes.Ville;

import java.util.*;

public class MapVilles {
    public static void main(String[] args) {
        List<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000)
                ,new Ville("Carcassonne", 47800)
                ,new Ville("Narbonne", 53400)
                ,new Ville("Lyon", 484000)
                ,new Ville("Foix", 9700)
                ,new Ville("Pau", 77200)
                ,new Ville("Marseille", 850700)
                ,new Ville("Tarbes", 40600));

        HashMap<String, Ville> villesNom  = new HashMap<>();
        Ville min = new Ville("",0);
        for (int i=0; i< villes.size(); i++){
            villesNom.put(villes.get(i).getNom(), villes.get(i));
            int precedent = 0;
            if (i>0){
                precedent = villes.get(i-1).getNbHavitants();
            }
            if (villes.get(i).getNbHavitants()<precedent){
                min = villes.get(i);
            }
        }
        System.out.println(villesNom);
        Set<String> cles= villesNom.keySet();
        Iterator<String> it = cles.iterator();
        while (it.hasNext()){
            if (Objects.equals(it.next(), min.getNom())){
                villesNom.remove(it.next());
            }
        }
        System.out.println(villesNom);
    }
}
