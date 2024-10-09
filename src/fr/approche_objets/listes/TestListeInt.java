package fr.approche_objets.listes;

import java.util.*;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        Collections.addAll(a, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println(a);
        System.out.println(a.size());

        int max = 0;
        for (Integer i : a){
            if (i>max){
                max = i;
            }
        }
        System.out.println(max);

        Integer min = 0;
        for (Integer i : a){
            if (i<min){
                min = i;
            }
        }
        a.remove(min);
        System.out.println(a);
        ListIterator<Integer> it = a.listIterator();
        while (it.hasNext()){
            int x = it.next();
            if (x<0){
                x = Math.abs(x);
                it.set(x);
            }
        }
        System.out.println(a);
    }
}
