package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {

        Compte c1 = new Compte(1520, 10000);
        CompteTaux c2 = new CompteTaux(15000, 3, 1.5);
        Compte[] tableauDeCompte = {c1, c2};

        for (Compte compte : tableauDeCompte) {
            System.out.println(compte);
        }
    }
}
