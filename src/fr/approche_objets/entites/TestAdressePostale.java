package fr.approche_objets.entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale();
        adr1.libelle = "";
        adr1.codePostale = 33000;
        adr1.numeroDeRue = 10;
        adr1.ville = "Bordeaux";
        AdressePostale adr2 = new AdressePostale();
        adr2.libelle = "";
        adr2.codePostale = 75000;
        adr2.numeroDeRue = 10;
        adr2.ville = "Paris";
    }
}
