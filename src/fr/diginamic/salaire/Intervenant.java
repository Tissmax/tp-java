package fr.diginamic.salaire;

public abstract class Intervenant {
    String nom;
    String prenom;

    public abstract double getSalaire();
    public abstract String getStatus();

    public String afficherDonnees(){
        return getStatus()+"\n"
                +nom.toUpperCase()+" "+prenom+"\n"
                +getSalaire();
    };

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
