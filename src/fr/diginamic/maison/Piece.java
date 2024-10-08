package fr.diginamic.maison;

public abstract class Piece {
    int superficie;
    int nEtage;

    public Piece(int superficie, int nEtage) {
        this.superficie = superficie;
        this.nEtage = nEtage;
    }
    public int getSuperficie(){
        return superficie;
    };

    public int getnEtage() {
        return nEtage;
    }

    public abstract String type();
    public String getType(){
        return type();
    }

}
