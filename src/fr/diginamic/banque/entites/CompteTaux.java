package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double taux;

    public CompteTaux(int nbCompte, int solde, double taux) {
        super(nbCompte, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString()+" Taux : "+taux+"%";
    }
}
