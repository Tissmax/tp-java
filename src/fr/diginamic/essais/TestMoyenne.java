package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        System.out.println(CalculMoyenne.calcul());
        CalculMoyenne.ajout(10);
        System.out.println(CalculMoyenne.calcul());
    }
}
