package p16_05;

public class Zadatak11 {
    public static void main(String[] args) {
        int arapskiBroj = brojevi("V");
        System.out.println(arapskiBroj);

    }

    static int brojevi(String broj) {
        if (broj.equals("I")) {
            return 1;
        } else if (broj.equals("II")) {
            return 2;
        } else if (broj.equals("III")) {
            return 3;
        } else if (broj.equals("IV")) {
            return 4;
        } else if (broj.equals("V")) {
            return 5;
        } else if (broj.equals("VI")) {
            return 6;
        } else if (broj.equals("VII")) {
            return 7;
        } else if (broj.equals("VIII")) {
            return 8;
        } else if (broj.equals("IX")) {
            return 9;
        } else if (broj.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }

}
