package fr.approche_objets.listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville v1 = new Ville("Marseille", 40);
        Ville v2 = new Ville("Marseille", 40);
        Ville v3 = new Ville("Marseille", 400);
        if (v1.equals(v2)) System.out.println("ok");
        else System.out.println("ko");
        if (v1.equals(v3)) System.out.println("ok");
        else System.out.println("ko");

    }
}
