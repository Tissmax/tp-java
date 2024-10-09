package fr.diginamic.jdr.services;

import fr.diginamic.jdr.entites.*;
import fr.diginamic.jdr.utils.RandomGenerateur;

public class Menu {

    public static void afficherMenu(){
        System.out.println("1. Nouveau personage");
        System.out.println("2. Combattre");
        System.out.println("3. Afficher votre score");
        System.out.println("4. Sortir");
    }

    public static int combattre(Personnage personnage) {
        int score = personnage.getScore();
        int typeMonstre = RandomGenerateur.genererNombre(1, 3);
        Loup loup = new Loup(RandomGenerateur.genererNombre(3, 8), RandomGenerateur.genererNombre(5, 10));
        Gobelin gobelin = new Gobelin(RandomGenerateur.genererNombre(5, 10), RandomGenerateur.genererNombre(10, 15));
        Troll troll = new Troll(RandomGenerateur.genererNombre(10, 15), RandomGenerateur.genererNombre(20, 30));
        if (personnage.getPv() > 0) {
            switch (typeMonstre) {
                case 1:
                    System.out.println("Un loup, vous regarde d'un air vicieux. Il regarde votre gorge en bavant, il va falloir lui passer sur le corp !");
                    while (personnage.getPv() >= 0 && loup.getPv() >= 0) {
                        Attaque.attaque(personnage, loup);
                    }
                    if (loup.getPv() <= 0) {
                        score += loup.getValeur();
                        personnage.setScore(score);
                        System.out.println("Vous regardez le loup gisant devant vous, et vous entendez un dernier couinement plaintif.");
                        System.out.println("Votre humanité semble vous quitter peu à peu...");
                        System.out.println("------------------");
                    }
                    break;
                case 2:
                    System.out.println("Un gobelin, veux vous faire les poches. Vous sortez votre lame pour vous défendre");

                    while (personnage.getPv() >= 0 && gobelin.getPv() >= 0) {
                        Attaque.attaque(personnage, gobelin);

                    }
                    if (gobelin.getPv() <= 0) {
                        score += gobelin.getValeur();
                        personnage.setScore(score);
                        System.out.println("Vous assenez un grand coup d'épée, et vous observez le corps du gobelin se fendre en deux..");
                        System.out.println("Une chose est maintenat sûre, votre bourse restera bien au chaud dans votre poche");
                        System.out.println("------------------");
                    }
                    break;
                case 3:
                    System.out.println("Un énorme Troll apparait, son gourdin fait 2m de plus que vous ! Fuyez si vous voulez survivre...");
                    while (personnage.getPv() >= 0 && troll.getPv() >= 0) {
                        Attaque.attaque(personnage, troll);
                    }
                    if (troll.getPv() <= 0) {
                        score += troll.getValeur();
                        personnage.setScore(score);
                        System.out.println("Vous avez réussi l'impensable, le monstre gigantesque gît inerte devant vous.");
                        System.out.println("Votre exploit ne tardera à retentir dans toute la valée !");
                        System.out.println("------------------");
                    }
                    break;
            }
        }
        return score;
    }

    public static int afficherScore(int score) {
        return score;
    }

    public static boolean sortir(boolean stop) {
        return stop = false;
    }
}
