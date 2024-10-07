package fr.diginamic.banque;


public class Credit extends Operation {
    public Credit (String dateOperation, double montant) {
        super(dateOperation, montant);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }

    @Override
    public String toString() {
        return getType()+"\n"+super.toString();
    }
}
