package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("EEEE dd MMMM yyyy");
        System.out.println(f.format(d));

        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY,19,23,59,30);
        d = cal.getTime();
        f = new SimpleDateFormat("yyyy MM dd hh mm ss");
        System.out.println(f.format(d));

        d = new Date();
        System.out.println(f.format(d));
    }
}
