package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016,Calendar.MAY,19,23,59,30);
        Date d  = cal.getTime();
        SimpleDateFormat f = new SimpleDateFormat("dd MM yyyy");
        System.out.println(f.format(d));

        Calendar cal2 = Calendar.getInstance();
        Date d2 = cal2.getTime();
        f = new SimpleDateFormat("yyyy MM dd hh mm ss");
        System.out.println(f.format(d2));
        Locale fr = Locale.FRANCE;
        Locale ch = Locale.CHINA;
        Locale ru = new Locale("ru", "RU");
        f = new SimpleDateFormat("yyyy MMMM EEEE hh mm ss", fr);
        System.out.println(f.format(d2));
        f = new SimpleDateFormat("yyyy MMMM EEEE hh mm ss", ch);
        System.out.println(f.format(d2));
        f = new SimpleDateFormat("yyyy MMMM EEEE hh mm ss", ru);
        System.out.println(f.format(d2));

    }
}
