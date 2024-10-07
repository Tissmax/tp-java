package fr.diginamic.operations;

public class CalculMoyenne {
    static double[] nb = {10, 20, 30};

    public static double[] ajout(double x){
        //La nouvelle valeur est stocké dans tableau
        double[] y = {x};
        //Stockage de l'ancien tableau
        double[] z = nb;
        nb = new double[nb.length+1];
        //Défilement dans les tableaux pour ajouter les entrées à a
        int posTableau = 0;
        for (double i : z) {
            nb[posTableau] = i;
            posTableau++;
        }
        for (double i : y) {
            nb[posTableau] = i;
            posTableau++;
        }
        return nb;
    }

    public static double calcul(){
        double somme = 0;

        for (double i : nb) {
            somme += i;
        }
        return somme/nb.length;
    }
}
