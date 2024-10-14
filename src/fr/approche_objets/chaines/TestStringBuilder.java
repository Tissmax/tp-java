package fr.approche_objets.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
        String s2 = "";
        long debut1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s2+=(i);
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin1 - debut1));
    }

}
