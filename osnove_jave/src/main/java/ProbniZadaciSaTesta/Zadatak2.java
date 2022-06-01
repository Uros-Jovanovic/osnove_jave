package p31_05.ProbniZadaciSaTesta;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int pocetniZvuk = 75;
        int trenutniZvuk = 75;
        int max = 100;
        int min = 0;
        boolean play = false;
        String poslednjaKomanda = "213";

        while (play == false) {
            System.out.print("Unesite, pojacaj, smanji, mute, un-mute: ");
           String komanda = s.nextLine();
            if (komanda.equals("pojacaj")) {
                if (trenutniZvuk + 10 < 100) {
                    trenutniZvuk = trenutniZvuk + 10;
                } else {
                    trenutniZvuk = max;
                }
            } else if (komanda.equals("smanji")) {
                if (trenutniZvuk - 10 > 0) {
                    trenutniZvuk = trenutniZvuk - 10;
                } else {
                    trenutniZvuk = min;
                }}
                 else if (komanda.equals("mute")) { trenutniZvuk = 0; }

             else if (komanda.equals("play")) {
                play = true;
                System.out.println("Trenutna jacina zvuka je: " + trenutniZvuk);
            } else {
                System.out.println("Uneli ste pogresnu komandu");

            }


        }
    }
}