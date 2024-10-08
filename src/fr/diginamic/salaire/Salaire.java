package fr.diginamic.salaire;

public class Salaire extends Intervenant{

    double montantMensuel;

    @Override
    public String getStatus() {
        return "Salaire";
    }

    @Override
    public double getSalaire() {
        return montantMensuel;
    }

    public Salaire(String nom, String prenom, double montantMensuel) {
        super(nom, prenom);
        this.montantMensuel = montantMensuel;
    }
}
