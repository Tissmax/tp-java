package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salaire;

public class TestIntervenant {
    public static void main(String[] args) {

        Salaire s = new Salaire("Darmanin", "Gérald", 150000.01);
        System.out.println(s.afficherDonnees());

        Pigiste p = new Pigiste("Jarre", "Jean-Michel", 12345.75, 12);
        System.out.println(p.afficherDonnees());
    }
}
