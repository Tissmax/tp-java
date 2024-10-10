package fr.approche_objets.fichier;

public class Ville {
    String nom;
    String codeDepartement;
    String region;
    int popTotale;

    public Ville(String nom, String codeDepartement, String region, int popTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.region = region;
        this.popTotale = popTotale;
    }

    @Override
    public String toString() {
        return
                 nom +";"+codeDepartement+";"+region+";"+popTotale;
    }
}
