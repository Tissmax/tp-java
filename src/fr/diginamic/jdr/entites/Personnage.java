package fr.diginamic.jdr.entites;

public class Personnage extends Creature{
    private int score;

    public Personnage(int force, int pv) {
        super(force, pv);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
