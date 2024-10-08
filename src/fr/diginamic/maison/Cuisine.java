package fr.diginamic.maison;

public class Cuisine extends Piece {
    public Cuisine(int superficie, int nEtage) {
        super(superficie, nEtage);
    }

    @Override
    public String type() {
        return "Cuisine";
    }
}
