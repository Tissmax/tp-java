package fr.approche_objets.listes;

public class Ville {
    String nom;
    int nbHavitants;

    public Ville(String nom, int nbHavitants) {
        this.nom = nom;
        this.nbHavitants = nbHavitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return  nom + " : "+
                " Habitants :" + nbHavitants+"\n";
    }
}
