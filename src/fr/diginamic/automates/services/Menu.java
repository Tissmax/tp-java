package fr.diginamic.automates.services;

import java.util.Scanner;

public class Menu {
    static boolean isRunning;
    public static int nbGeneration;
    public static int intervalleGene;

    public static boolean isRunning(int nbGeneration) {
        return nbGeneration == 0;
    }

    public static String start() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu de la vie !");
        //1 seconde de délai
        Thread.sleep(1000);
        System.out.println("Choissez un nombre de génération tapez 0 pour une infinité");
        nbGeneration = sc.nextInt();
        //1/2 seconde de délai
        intervalleGene = 500;
        System.out.println("""
                Choisissez un pattern dans la liste
                1.Vaisseau
                2.Oscillateur""");
        System.out.println("Ou fermez le programme en appuyant sur 3");
        byte choix = sc.nextByte();
        switch (choix){
            case 1:
                System.out.println("Vaisseau :");
                System.out.println("1. Planneur");
                System.out.println("2. LWSS");
                System.out.println("3. Retour");
                choix = sc.nextByte();
                switch (choix){
                    case 1:
                        return "planneur";
                    case 2:
                        return "LWSS";
                    case 3:
                        System.out.println("""
                                Choisissez un pattern dans la liste
                                1.Vaisseau
                                2.Oscillateur""");
                        System.out.println("Ou fermez le programme en appuyant sur 3");
                        break;
                    default:
                        System.out.println("Commande non comprise, réitérer");
                }
            case 2:
                System.out.println("Oscillateur");
                System.out.println("1. Clignotant");
                System.out.println("2. Croix");
                System.out.println("3. Diagonale");
                choix = sc.nextByte();
                switch (choix){
                    case 1:
                        return "clignotant";
                    case 2:
                        return "croix";
                    case 3:
                        return "diagonale";
                    case 4:
                        System.out.println("""
                                Choisissez un pattern dans la liste
                                1.Vaisseau
                                2.Oscillateur""");
                        System.out.println("Ou fermez le programme en appuyant sur 3");
                        break;
                    default:
                        System.out.println("Commande non comprise, réitérer");
                        break;
                }
            case 3:
                isRunning=false;
                sc.close();
                break;
            default:
                System.out.println("Commande non comprise, réitérer");
        }
        return "";
    }
}
