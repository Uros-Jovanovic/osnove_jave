package p16_05;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        5. Zadatak
//        Napisati metodu stampajApsolutnuVrednost,
//                koja stampa apsolutnu vrednost   prosledjene vrednosti.
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = s.nextInt();
        int z = -4;
        apsolutnoA(a);
        apsolutnoA(-54);
        apsolutnoA(-32);
        apsolutnoA(z);

    }

    static void apsolutnoA(int a) {
        if (a < 0) {
            a = -a;
        } else {
            a = a;
        }
        System.out.println("Apsolutna vrednost je: " + a);
    }
}
