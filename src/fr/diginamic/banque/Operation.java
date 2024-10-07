package fr.diginamic.banque;


public abstract class Operation {

    String dateOperation;
    double montant;
    double solde;

    public Operation(String dateOperation, double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Date : " + dateOperation + '\n' +
                "Montant :" + montant;
    }

    public abstract String  getType();

    public double solde(String type) {
        if (type == "CREDIT") {
           solde += montant;
        } else {
            solde -= montant;
        }
        return solde;
    }
}
