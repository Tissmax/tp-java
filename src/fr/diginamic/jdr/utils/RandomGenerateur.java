package fr.diginamic.jdr.utils;

import java.util.Random;

public class RandomGenerateur {

    public static int genererNombre(int min, int max) {
        Random rn = new Random();
        int nb = rn.nextInt(max - min + 1) + min;
        return nb;
    }
}
