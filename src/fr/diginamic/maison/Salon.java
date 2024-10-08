package fr.diginamic.maison;

public class Salon extends Piece{
    public Salon(int superficie, int nEtage) {
        super(superficie, nEtage);
    }

    @Override
    public String type() {
        return "Salon";
    }
}
