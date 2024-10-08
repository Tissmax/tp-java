package fr.diginamic.maison;

public class Chambre extends Piece{
    public Chambre(int superficie, int nEtage) {
        super(superficie, nEtage);
    }

    @Override
    public String type() {
        return "Chambre";
    }
}
