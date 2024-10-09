package fr.approche_objets.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVille {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000)
                ,new Ville("Carcassonne", 47800)
                ,new Ville("Narbonne", 53400)
                ,new Ville("Lyon", 484000)
                ,new Ville("Foix", 9700)
                ,new Ville("Pau", 77200)
                ,new Ville("Marseille", 850700)
                ,new Ville("Tarbes", 40600));

        Ville max = villes.get(1);
        for (int i = 0; i < villes.size(); i++) {
                if (max.nbHavitants<villes.get(i).nbHavitants){
                    max = villes.get(i);
            }
        }
        System.out.println(max);

        Ville min = villes.get(1);
        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).nbHavitants< min.nbHavitants){
                min = villes.get(i);
//                System.out.println(min);
            }
        }
        villes.remove(min);

        for (Ville v : villes) {
            if (v.nbHavitants>=100000){
                v.setNom(v.nom.toUpperCase());            }
        }
        System.out.println(villes);

    }
}

