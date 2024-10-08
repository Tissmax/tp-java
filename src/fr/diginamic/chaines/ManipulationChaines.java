package fr.diginamic.chaines;

import fr.diginamic.entites.Salaire;

import java.util.Arrays;

public class ManipulationChaines {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int length = chaine.length();
        System.out.println("Longueur : "+length);

        int pointVirgule = chaine.indexOf(';');
        System.out.println(pointVirgule);

        int start = chaine.indexOf(';');
        int end = chaine.indexOf(';', 7);
        String nom = chaine.substring(start+1, end);
        System.out.println(nom.toUpperCase()+" "+nom.toLowerCase());

        String[] a = chaine.split(";");
        System.out.println(Arrays.toString(a));

        String chaineSalaire = a[2].replace(" ", "");
        double salaire = Double.parseDouble(chaineSalaire);
        Salaire s = new Salaire(a[0], a[1], salaire);
        System.out.println(s);
    }
}
