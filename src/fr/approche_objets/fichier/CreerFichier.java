package fr.approche_objets.fichier;

import java.io.File;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

    public static void main(String[] args) throws Exception {
        Path pathOrigine = Paths.get("/home/tiss/Bureau/Tps/recensement.csv");
        Path path = Paths.get("/home/tiss/Bureau/Tps/recensement2.csv");
        Files.copy(pathOrigine,path, StandardCopyOption.REPLACE_EXISTING);
        List<String> lines = Files.readAllLines(path);
        List<String> lines2 = new ArrayList<>();

        for (int i=0; i<=100; i++) {
            lines2.add(lines.get(i));
        }
        Files.write(path, lines2);
    }


}

