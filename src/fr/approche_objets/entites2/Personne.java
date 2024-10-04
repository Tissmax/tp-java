package fr.approche_objets.entites2;

import fr.approche_objets.entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void showPersonne(String nom, String prenom) {
        System.out.println(nom.toUpperCase()+ " " + prenom.toUpperCase());
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public void setPrenom (String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse (AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String getNom () {
        return this.nom;
    }
    public String getPrenom () {
        return this.prenom;
    }
    public AdressePostale getAdresse () {
        return this.adresse;
    }
}
