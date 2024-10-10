package fr.approche_objets.maps;

public class Pays {
    String nom;
    String nbHabitant;
    String continent;

    public Pays(String nom, String nbHabitant, String continent) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(String nbHabitant) {
        this.nbHabitant = nbHabitant;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
