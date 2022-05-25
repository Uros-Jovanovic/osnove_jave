package ProbniZadaciSaTesta;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> odigraniBrojevi = new ArrayList<Integer>();
        ArrayList<Integer> izvuceniBrojevi = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        odigraniBrojevi.add(5);
        odigraniBrojevi.add(10);
        odigraniBrojevi.add(15);
        odigraniBrojevi.add(20);
        odigraniBrojevi.add(25);
        odigraniBrojevi.add(30);
        odigraniBrojevi.add(35);
        boolean daLiJeTiketDobitan= true;



        for ( int i = 0; i < 7 ; i++) {
             System.out.print("Izvuceni broj je: ");
             int x = s.nextInt();
            izvuceniBrojevi.add(x);
        if (odigraniBrojevi.get(i) != izvuceniBrojevi.get(i)){
            daLiJeTiketDobitan = false;}
        else { daLiJeTiketDobitan = true;}}

        if (daLiJeTiketDobitan == true) {
            System.out.println("Tiket je dobitan");}
                else {
            System.out.println("Tiket je gubitan");}
        }
         }


