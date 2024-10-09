package fr.approche_objets.listes.tri;

import fr.approche_objets.listes.Ville;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville ville, Ville t1) {
        if (ville.getNbHavitants()> t1.getNbHavitants()){
            return -1;
        } else if (ville.getNbHavitants()< t1.getNbHavitants()) {
            return 1;
        }
        return 0;
    }
}
