package fr.approche_objets.utils;

public class TestMethodeStatic {

    static int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        String chaine = "10";
        Integer chaineInt = new Integer(chaine);
        int c = chaineInt;
        System.out.println(max(a, b));

    }

    static Integer max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
