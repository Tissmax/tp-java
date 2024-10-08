package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    int nbJoursDeTravail;
    double salaireJour;

    @Override
    public String getStatus() {
        return "Pigiste";
    }

    @Override
    public double getSalaire() {
        return salaireJour*nbJoursDeTravail;
    }

    public Pigiste(String nom, String prenom, double salaireJour, int nbJoursDeTravail) {
        super(nom, prenom);
        this.salaireJour = salaireJour;
        this.nbJoursDeTravail = nbJoursDeTravail;
    }
}
