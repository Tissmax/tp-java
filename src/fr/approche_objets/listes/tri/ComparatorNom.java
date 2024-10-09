package fr.approche_objets.listes.tri;

import fr.approche_objets.listes.Ville;

import java.util.Comparator;

public class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville ville, Ville t1) {
        return ville.getNom().compareTo(t1.getNom());
    }
}
