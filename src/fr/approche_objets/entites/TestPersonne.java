package fr.approche_objets.entites;

import fr.approche_objets.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        p1.nom = "Dupont";
        p1.prenom = "Henri";
        p1.adresse = new AdressePostale();
        p1.adresse.ville = "Paris";
        p1.adresse.codePostale = 75000;
        p1.adresse.numeroDeRue = 10;
        p1.adresse.libelle = "rue du chat";
        Personne p2 = new Personne();
        p2.nom = "Dutrou";
        p2.prenom = "Jacques";
        p2.adresse = new AdressePostale();
        p2.adresse.ville = "Bordeaux";
        p2.adresse.codePostale = 33000;
        p2.adresse.numeroDeRue = 15;
        p2.adresse.libelle = "rue st catherine";
    }
}
