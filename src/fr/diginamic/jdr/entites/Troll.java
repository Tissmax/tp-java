package fr.diginamic.jdr.entites;

public class Troll extends Creature{
    private int valeur = 5;
    private String nom = "Troll";

    public Troll(int force, int pv) {
        super(force, pv);

    }

    public int getValeur() {
        return valeur;
    }

    public String getNom() {
        return nom;
    }
}
