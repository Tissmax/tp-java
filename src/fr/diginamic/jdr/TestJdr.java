package fr.diginamic.jdr;

import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.services.Boot;
import fr.diginamic.jdr.services.Menu;
import fr.diginamic.jdr.utils.CreerEntite;
import fr.diginamic.jdr.utils.Input;
import fr.diginamic.jdr.utils.RandomGenerateur;

public class TestJdr {
    public static void main(String[] args) {

        Menu.afficherMenu();
        Boot.lancement();

    }
}
