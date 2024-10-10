package fr.approche_objets.fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VillesDepartement {
    public static void main(String[] args) throws Exception{

        ArrayList<Ville> villes = new ArrayList<>();
        System.out.println(villes);
        Path path = Paths.get("/home/tiss/Bureau/Tps/recensement.csv");
        List<String> lignes = Files.readAllLines(path);
        for (int i = 0; i< lignes.size(); i++){
            if (i > 0){
                String[] tokens = lignes.get(i).split(";");
                villes.add(new Ville(tokens[6], tokens[2], tokens[1],
                        Integer.parseInt(tokens[9].replaceAll(" ", ""))));
            }
        }

        int nVilleD = 0;
        int popParD = 0;
        String departement = "01";
        for (Ville ville:villes){
            if(Objects.equals(ville.codeDepartement, departement)){
                nVilleD++;
                popParD+=ville.popTotale;
            }
        }
        System.out.println("Il y a " + nVilleD+" commune dans le "+departement);
        System.out.println("Il y a " + popParD+" personnes dans le "+departement);
    }

}

