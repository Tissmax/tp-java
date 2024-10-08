package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {
        Chambre c = new Chambre(15, 1);
        Chambre c2 = new Chambre(20,1);
        Salon s = new Salon(60, 0);
        SalleDeBain sB = new SalleDeBain(12, 0);
        SalleDeBain sB2 = new SalleDeBain(8, 1);
        Cuisine cu = new Cuisine(30, 0);
        WC wc = new WC(5, 1);

        Piece[] pieces = {c, c2, s, sB, sB2, wc};
        Maison maison = new Maison(pieces);

//        System.out.println(maison.superficieTotal());
        maison.ajouterPiece(cu);
        System.out.println(maison.superficieTotal());

//        maison.ajouterPiece(null);
//        //Java lance une erreur pour m'expliquer que mon code pointe vers un null
//        System.out.println(maison.superficieTotal());

//        Chambre c3 = new Chambre(-160, 0);
//        maison.ajouterPiece(c3);
//        System.out.println(maison.superficieTotal());

        System.out.println(maison.superficieEtage(1));
        System.out.println(maison.superficieType("WC"));
        System.out.println(maison.nbPiece("Chambre"));

    }
}
