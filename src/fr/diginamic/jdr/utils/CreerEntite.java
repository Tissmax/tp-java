package fr.diginamic.jdr.utils;

import fr.diginamic.jdr.entites.Gobelin;
import fr.diginamic.jdr.entites.Loup;
import fr.diginamic.jdr.entites.Personnage;
import fr.diginamic.jdr.entites.Troll;

public class CreerEntite {
    
    public static Personnage personnage(){
        Personnage p = new Personnage(RandomGenerateur.genererNombre(12,18), RandomGenerateur.genererNombre(20,50));
        return p;
    }
    
    public static Troll troll(){
        Troll t = new Troll(RandomGenerateur.genererNombre(10,15), RandomGenerateur.genererNombre(20,30));
        return t;
    }
    
    public static Loup loup(){
        Loup l = new Loup(RandomGenerateur.genererNombre(3,8), RandomGenerateur.genererNombre(5,10));
        return l;
    }
    
    public static Gobelin gobelin(){
        Gobelin g = new Gobelin(RandomGenerateur.genererNombre(5,10), RandomGenerateur.genererNombre(10,15));
        return g;
    }
}
