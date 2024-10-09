package fr.diginamic.jdr.entites;

public class Gobelin extends Creature{
    private int valeur = 2;
    private String nom = "Gobelin";

    public Gobelin(int force, int pv) {
        super(force, pv);
    }

    public int getValeur() {
        return valeur;
    }

    public String getNom() {
        return nom;
    }
}
