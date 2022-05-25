package TEST;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> tabelaCela = new ArrayList<Integer>();
        tabelaCela.add(3);
        tabelaCela.add(4);
        tabelaCela.add(1);
        tabelaCela.add(5);
        tabelaCela.add(2);
        tabelaCela.add(3);
        tabelaCela.add(6);
        tabelaCela.add(7);
        tabelaCela.add(1);
        tabelaCela.add(2);
        tabelaCela.add(3);
        tabelaCela.add(1);
        tabelaCela.add(3);
        tabelaCela.add(4);
        tabelaCela.add(5);
        tabelaCela.add(5);
        tabelaCela.add(6);
        tabelaCela.add(7);
        tabelaCela.add(2);
        tabelaCela.add(1);
        tabelaCela.add(2);
        tabelaCela.add(4);
        tabelaCela.add(6);
        tabelaCela.add(5);
        tabelaCela.add(3);
        int ukupnaSumaJe = 0;

        for (int i = 0; i < tabelaCela.size(); i++) {
            System.out.print(tabelaCela.get(i) + " ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.print("Unesite kolonu koju zelite da sabirate: ");
        int kolona = s.nextInt();

        for (int i = 0; i < 5; i++) {
            ukupnaSumaJe = tabelaCela.get((kolona)) + ukupnaSumaJe;
            kolona = kolona + 5;
        }
        System.out.println("Ukupna suma je : " + ukupnaSumaJe);
    }
}