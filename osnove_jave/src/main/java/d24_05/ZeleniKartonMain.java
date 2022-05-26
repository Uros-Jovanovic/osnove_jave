package d24_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton> kartoni = new ArrayList<ZeleniKarton>();
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        int brojac = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Unesit ime i prezime studenta: ");
            String imeIPrezimeStudenta = s.next();
            System.out.print("Unesite broj indeksa: ");
            int brojIndeksa = s.nextInt();
            System.out.print("Unesit naziv predmeta: ");
            String nazivPredmeta = s.next();
            System.out.print("Unesit ime i prezime profesora: ");
            String imeIPrezimeProfesora = s.next();
            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();
            if ( ocena > 5)
            {brojac++;}
            ZeleniKarton x = new ZeleniKarton(
                    imeIPrezimeStudenta,
                    brojIndeksa,
                    nazivPredmeta,
                    imeIPrezimeProfesora,
                    ocena);
            kartoni.add(x);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ime i prezime studenta: " + kartoni.get(i).getImeIPrezimeStudenta());
            System.out.println("Broj indeksa: " + kartoni.get(i).getBrojIndeksa());
            System.out.println("Naziv predmeta: " + kartoni.get(i).getNazivPredmeta());
            System.out.println("Ime i prezime profesora: " + kartoni.get(i).getImeiPrezimeProfesora());
            System.out.println("Ocena: " + kartoni.get(i).getOcena());


        }
        System.out.println();
        double prosecnaOcenaPolozenih = 0.0;
        double prosecnaOcena = 0.0;
        for (int i = 0; i < n; i++) {
            prosecnaOcena = prosecnaOcena + 1.0 * kartoni.get(i).getOcena();
            if (kartoni.get(i).getOcena() > 5) {
                prosecnaOcenaPolozenih = prosecnaOcenaPolozenih + 1.0 * kartoni.get(i).getOcena();
            }
        }
        prosecnaOcena = prosecnaOcena / n;
        System.out.println("Prosecna ocena je: " + prosecnaOcena);
        prosecnaOcenaPolozenih = prosecnaOcenaPolozenih / brojac;
        System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozenih);



        }
    }
