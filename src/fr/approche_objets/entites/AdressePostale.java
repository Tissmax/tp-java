package fr.approche_objets.entites;

import java.util.Objects;

public class AdressePostale {
    int numeroDeRue;
    String libelle;
    int codePostale;
    String ville;
    AdressePostale (int numeroDeRue, String libelle, int codePostale, String ville) {
        this.numeroDeRue = numeroDeRue;
        this.libelle = libelle;
        this.codePostale = codePostale;
        this.ville = ville;
    }
}
