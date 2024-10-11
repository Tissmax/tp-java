package fr.approche_objets.fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class LecctureFichier {
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

        String[] ligne1 = lignes.getFirst().split(";");
        String ligne1Complete = ligne1[6]+";"+ligne1[2]+";"+ligne1[1]+";"+ligne1[9];
        List<String> grandesVilles = new ArrayList<>();
        grandesVilles.add(ligne1Complete);

        for (Ville ville: villes){
            if (ville.popTotale>=25000)
                grandesVilles.add(ville.toString());
            }
        Path path2 = Paths.get("/home/tiss/Bureau/Tps/recensement25000.csv");
        Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
        Files.write(path2, grandesVilles);
        }



    }
