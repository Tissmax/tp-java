package fr.diginamic.maison;

public class WC extends Piece{
    public WC(int superficie, int nEtage) {
        super(superficie, nEtage);
    }

    @Override
    public String type() {
        return "WC";
    }
}
