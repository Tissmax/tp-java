package fr.approche_imperative.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i <= 9; i++) {
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
        int i = 0;
        while (i < 10){
            i++;
            System.out.println(i);
        }
        i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }        i = 0;
        while (i < 9) {
            i++;
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
