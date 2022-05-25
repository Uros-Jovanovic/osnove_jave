package p16_05;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
//        7.Zadatak
//        Napisati metodu koja vraca suprotno negativna broj od prosledjenog.
//        Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11
        int x = apsolutnoA(3);
        System.out.println(x);
    }

    static int apsolutnoA(int a){
        int s = a*(-1);
        return s;
        }
}
