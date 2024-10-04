package fr.approche_objets.entites;

import fr.approche_objets.entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(10, "rue St cat", 33000, "Bordeaux");
        AdressePostale adr2 = new AdressePostale(15, "rue", 75000, "Paris");

        Personne p1 = new Personne("Dupont", "Henri", adr1);
        Personne p2 = new Personne("Dutrou", "Jacques", adr2);
    }
}
