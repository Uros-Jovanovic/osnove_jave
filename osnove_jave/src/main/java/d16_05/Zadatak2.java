package d16_05;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//       Napisati funkciju koja za dva jednocifrena broja
//       koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//       ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//       ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost x: ");
        int x = s.nextInt();
        System.out.print("Unesite vrednost y: ");
        int y = s.nextInt();
        int z = x * 10 + y;
        System.out.println("Nova vrednost je: "+ z);
    }
}
