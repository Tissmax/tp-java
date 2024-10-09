package fr.diginamic.jdr.services;

import fr.diginamic.jdr.entites.*;
import fr.diginamic.jdr.utils.CreerEntite;
import fr.diginamic.jdr.utils.Input;
import fr.diginamic.jdr.utils.RandomGenerateur;

public class Menu {

    public static void afficherMenu(){
        System.out.println("1. Nouveau personage");
        System.out.println("2. Combattre");
        System.out.println("3. Afficher votre score");
        System.out.println("4. Sortir");
    }

    public static void combattre(Personnage personnage){
        int score = personnage.getScore();
        int typeMonstre = RandomGenerateur.genererNombre(1,3);
        Loup loup = new Loup(RandomGenerateur.genererNombre(3,8), RandomGenerateur.genererNombre(5,10));
        Gobelin gobelin = new Gobelin(RandomGenerateur.genererNombre(5,10), RandomGenerateur.genererNombre(10,15));
        Troll troll = new Troll(RandomGenerateur.genererNombre(10,15), RandomGenerateur.genererNombre(20,30));
        boolean isRunning= true;
        isRunning = sortir(isRunning);

        if (personnage.getPv()>0){
            switch (typeMonstre){
                case 1 :
                    System.out.println("Un loup, vous regarde d'un air vicieux. Il regarde votre gorge en bavant, il va falloir lui passer sur le corp !");
                    while (sortir(isRunning)) {
                        Attaque.attaque(personnage, loup, sortir(isRunning));
                    }
                    if (loup.getPv()<=0){
                        score += loup.getValeur();
                        personnage.setScore(score);
                        System.out.println("Vous avez réussi l'impensable, le monstre gigantesque gît inerte devant vous.");
                        System.out.println("Votre exploit ne tardera à retentir dans toute la valée !");
                    }
                    break;
                case 2:
                    System.out.println("Un gobelin, veux vous faire les poches. Vous sortez votre lame pour vous défendre");

                    while (sortir(isRunning)){
                        Attaque.attaque(personnage, gobelin, sortir(isRunning));

                    }
                    if (gobelin.getPv()<=0){
                        score += gobelin.getValeur();
                        personnage.setScore(score);
                        System.out.println("Vous avez réussi l'impensable, le monstre gigantesque gît inerte devant vous.");
                        System.out.println("Votre exploit ne tardera à retentir dans toute la valée !");
                    }
                    break;
                case 3:
                    System.out.println("Un énorme Troll apparait, son gourdin fait 2m de plus que vous ! Fuyez si vous voulez survivre...");
                    while (sortir(isRunning)){
                        Attaque.attaque(personnage, troll, sortir(isRunning));
                    }
                    if (troll.getPv()<=0){
                        score += troll.getValeur();
                        personnage.setScore(score);
                        System.out.println("Vous avez réussi l'impensable, le monstre gigantesque gît inerte devant vous.");
                        System.out.println("Votre exploit ne tardera à retentir dans toute la valée !");
                    }
                    break;
            }
        } else {
            System.out.println("Vous êtes mort, mais vos exploits resteront graver dans les mémoires");
            System.out.printf("Votre score est de %s", afficherScore(score));
        }
    }

    public static int afficherScore(int score){
        System.out.println(score);
        return score;
    }

    public static boolean sortir(boolean a) {
        return a = !a;
    }
}
