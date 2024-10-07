package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte c1 = new Compte(1520, 10000);
        System.out.println(c1);
        //Les données affichées sont incompréhensibles, il manque la méthode toString()
    }
}
