package fr.diginamic.banque;

public class TestOperation {

    static double s;

    public static void main(String[] args) {
        Debit d1 = new Debit("10 juillet", 16.00);
        Debit d2 = new Debit("15 juillet", 32.00);
        Debit d3 = new Debit("20 juillet", 160.00);
        Credit c1 = new Credit("25 juillet", 1500.50);
        Operation[] operations = {d1, d2, d3, c1};

        for (Operation i : operations) {
            s += i.solde(i.getType());
            System.out.println(i+"\n"+"Solde :"+s);
        }
    }
}
