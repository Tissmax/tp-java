package fr.diginamic.maison;

public class SalleDeBain extends Piece{
    public SalleDeBain(int superficie, int nEtage) {
        super(superficie, nEtage);
    }

    @Override
    public String type() {
        return "SalleDeBain";
    }
}
