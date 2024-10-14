package fr.approche_objets.listes;

import java.util.Objects;

public class Ville implements Comparable<Ville>{
    String nom;
    int nbHavitants;

    @Override
    public int compareTo(Ville ville) {
//        Trie par nom
//        return this.nom.compareTo(ville.nom);
//        Trie par nombre d'habitant
        if (this.nbHavitants>ville.nbHavitants){
            return 1;
        }
        else if (this.nbHavitants<ville.nbHavitants){
            return -1;
        }
        return 0;
//        Trie par ordre décroissant des villes ayant plus de 25000 habitants
//        if (this.nbHavitants>25000){
//            if (this.nbHavitants> ville.nbHavitants){
//                return -1;
//            }
//            else if (this.nbHavitants< ville.nbHavitants) {
//                return 1;
//            }
//        }
//        return 0;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHavitants() {
        return nbHavitants;
    }

    public Ville(String nom, int nbHavitants) {
        this.nom = nom;
        this.nbHavitants = nbHavitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ville)) return false;
        Ville that = (Ville) o;
        return nbHavitants == that.getNbHavitants() && Objects.equals(nom,that.getNom());
    }

    @Override
    public String toString() {
        return  nom + " : "+
                " Habitants :" + nbHavitants+"\n";
    }
}
