package fr.approche_objets.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        Collections.addAll(str, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        int max=0;
        for (int i = 0; i < str.size(); i++) {
                if (max<str.get(i).length()){
                    max = str.get(i).length();
            }
        }
        System.out.println(max);

        for (int i = 0; i < str.size(); i++) {
            str.set(i, str.get(i).toUpperCase());
        }
        System.out.println(str);
        Iterator<String> it = str.iterator();
        while(it.hasNext()){
            if (it.next().charAt(0) == 'N'){
                it.remove();
            }
        }
        System.out.println(str);
    }

}
