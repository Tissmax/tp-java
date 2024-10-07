package fr.diginamic.banque.entites;

public class Compte {
    private int nbCompte;
    private int solde;

    public Compte(int nbCompte, int solde) {
        this.nbCompte = nbCompte;
        this.solde = solde;
    }

    public int getNbCompte() {
        return nbCompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void setNbCompte(int nbCompte) {
        this.nbCompte = nbCompte;
    }

    @Override
    public String toString() {
        return "Compte n° : "
                + nbCompte +
                " Solde : "
                + solde+"€";
    }
}
