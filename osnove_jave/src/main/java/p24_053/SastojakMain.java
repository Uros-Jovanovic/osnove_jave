package p24_053;

import java.util.ArrayList;
import java.util.Scanner;

public class SastojakMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj sastojaka: ");
        int b= s.nextInt();


        ArrayList<Sastojak> torta = new ArrayList<Sastojak>();

        for ( int i = 0 ; i<b ; i++)
        {
            System.out.print(" Unesite naziv sastojka: ");
            String naziv = s.nextLine();
            System.out.print(" Unesite cenu sastojka: ");
            int cena = s.nextInt();
            Sastojak x = new Sastojak(naziv, cena);

        }

//        Sastojak brasno = new Sastojak("Brasno", 120);
//        Sastojak voda = new Sastojak("Voda", 50);
//        Sastojak ulje = new Sastojak("ulje", 220);

    }
}
