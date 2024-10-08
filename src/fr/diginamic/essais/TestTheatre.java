package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre a = new Theatre(150);
        a.inscrire(12, 5.5);
        a.inscrire(32, 5.5);
        a.inscrire(100, 5.5);
        a.inscrire(12, 5.5);

    }
}
