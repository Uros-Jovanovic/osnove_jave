package d13_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizA = new ArrayList<Integer>();
        nizA.add(3);
        nizA.add(5);
        nizA.add(2);
        nizA.add(7);
        nizA.add(2);
        nizA.add(1);
        nizA.add(5);
        nizA.add(1);
        nizA.add(6);
        nizA.add(2);
        nizA.add(3);
        nizA.add(8);
        nizA.add(9);
        nizA.add(7);
        nizA.add(6);
        nizA.add(6);
        nizA.add(2);
        nizA.add(5);
        nizA.add(2);
        nizA.add(4);
        nizA.add(5);
        nizA.add(2);
        nizA.add(8);
        nizA.add(1);
        nizA.add(2);

        for (int i = 0; i < nizA.size(); i++) {
            System.out.print(nizA.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.print("Unesite poziciju: ");
        int pozicija = s.nextInt();
        int prviBroj = nizA.get(pozicija);
        int drugiBroj;
        int treciBroj;
        int cetvrtiBroj;
        int petiBroj;

        if ((pozicija + 1) % 5 == 0) {
            drugiBroj = 0;
        } else {
            drugiBroj = nizA.get(pozicija + 1);
        }
        if ((pozicija - 1) % 5 == 4 || (pozicija - 1) < 0) {
            treciBroj = 0;
        } else {
            treciBroj = nizA.get(pozicija - 1);
        }
        if ((pozicija + 5) > 24) {
            cetvrtiBroj = 0;
        } else {
            cetvrtiBroj = nizA.get(pozicija + 5);
        }
        if ((pozicija - 5) < 0) {
            petiBroj = 0;
        } else {
            petiBroj = nizA.get(pozicija - 5);
        }

        int zbir = prviBroj + drugiBroj + treciBroj + cetvrtiBroj + petiBroj;
        System.out.print("Suma je " + zbir );

    }
}