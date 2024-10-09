package fr.diginamic.jdr.services;

import fr.diginamic.jdr.entites.Creature;
import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.utils.RandomGenerateur;

public class Attaque {

    public static void attaque(Personnage personnage, Creature monstre){
        int attPersonnage = personnage.getForce() + RandomGenerateur.genererNombre(1,10);
        int attMonstre = monstre.getForce() + RandomGenerateur.genererNombre(1,10);
        //Gestion de l'attaque et revalorisation de la variable pv en fct du gagnant
        if (attMonstre>attPersonnage){
            int degats = attMonstre-attPersonnage;
            personnage.setPv(personnage.getPv()-(attMonstre-attPersonnage));
            System.out.printf("Vous subissez %s dégat\n", degats);
        }
        if (attPersonnage>attMonstre){
            int degats = attPersonnage-attMonstre;
            monstre.setPv(monstre.getPv()-(attPersonnage-attMonstre));
            System.out.printf("Vous infligez %s dégats au %s\n", degats, monstre.getClass().getSimpleName());
        }

    }
}
