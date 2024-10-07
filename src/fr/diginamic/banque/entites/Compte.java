package fr.diginamic.banque.entites;

public class Compte {
    int nbCompte;
    int solde;

    public Compte(int nbCompte, int solde) {
        this.nbCompte = nbCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "nbCompte=" + nbCompte +
                ", solde=" + solde +
                '}';
    }
}
