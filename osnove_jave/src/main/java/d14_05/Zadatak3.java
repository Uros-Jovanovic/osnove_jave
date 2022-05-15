package d14_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);


//        Napisati program koji ima niz brojeva duzine 10.
//        Niz je fiksnih vrednosti (ne u nosi ih korisnik)
//        a zatim se od korisnika ucitava pozicija elementa
//        koji zeli da izbaci iz niza.
//        Pre i nakon izbacivanja ispisati niz na ekranu.
//        Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//                Commitujte zadatak i pushujte na github sa porukom
//    Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
        nizA.add(2);
        nizA.add(4);
        nizA.add(5);
        nizA.add(1);
        nizA.add(3);
        nizA.add(6);
        nizA.add(4);
        nizA.add(3);
        nizA.add(6);
        nizA.add(7);
        System.out.println(nizA);
        System.out.println("Unesite index elementa koji zelite da izbacite: ");
        int x = s.nextInt();

        if ( x >= 0 && x < 10)
        { nizA.remove(x); }
        System.out.println(nizA);
    }
}
