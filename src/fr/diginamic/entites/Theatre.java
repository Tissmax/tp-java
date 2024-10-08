package fr.diginamic.entites;

public class Theatre {
    String nom;
    int max;
    int totalClient;
    double recette;

    public Theatre (int max) {
        this.max = max;
    }
    public void inscrire(int nbClients, double prix) {
        if (totalClient < max) {
            totalClient += nbClients;
            recette += prix*nbClients;
        }
        if (totalClient > max) {
            System.out.println("Erreur le nombre de clients dépasse la capacité du théâtre");
            System.out.println("Nombre de clients : "+totalClient+"\n"+"Recette : "+recette+"€");
        }
    }
}
