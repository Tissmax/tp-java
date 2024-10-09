package fr.diginamic.jdr.entites;

public class Loup extends Creature{
    private int valeur = 1;
    private String nom = "Loup";

    public Loup(int force, int pv) {
        super(force, pv);
    }

    public int getValeur() {
        return valeur;
    }

    public String getNom() {
        return nom;
    }
}
