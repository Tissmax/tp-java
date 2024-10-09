package fr.diginamic.jdr.services;

import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.utils.RandomGenerateur;

public class Attaque {

    public static boolean attaque(Personnage personnage, Creature monstre, boolean a){
        int attPersonnage = personnage.getForce() + RandomGenerateur.genererNombre(1,10);
        int attMonstre = monstre.getForce() + RandomGenerateur.genererNombre(1,10);
        //Gestion de l'attaque et revalorisation de la variable pv en fct du gagnant
        if (attMonstre>attPersonnage){
            int degats = attMonstre-attPersonnage;
            personnage.setPv(personnage.getPv()-(attMonstre-attPersonnage));
            System.out.printf("Vous subissez %s dégat\n", degats);
            if (personnage.getPv() >= 0){
                a = false;
            }
        }
        if (attPersonnage>attMonstre){
            int degats = attPersonnage-attMonstre;
            monstre.setPv(monstre.getPv()-(attPersonnage-attMonstre));
            int pPv = personnage.getPv();
            int cPv = monstre.getPv();
            System.out.printf("Vous infligez %s dégats au %s\n", degats, monstre.getClass().getSimpleName());
            if (monstre.getPv() >= 0){
                a = false;
            }
        }
        return a;
    }
}
