package d13_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizA = new ArrayList<Integer>();

        //        Kreirati novi fajl u paketu sa danasnjeg predavanja.
//        Fajl se zove tekstovi_zadataka.txt i u njemu pejstujte tekst sa ovog zadataka.
//                Kreirati novu java klasu Git_Zadatak1.java i u njoj
//        ispisite na ekranu sve git naredbe koje smo radili.
//                Commit-ujte ovo kao promenu “Predavanja 13.05 Git Zadatak 1”
//        Push-ujte na github
//        git status
//        git add osnove_jave/src/main/java/p13_05_2022/Git_Zadatak1.java
//        git add osnove_jave/src/main/java/p13_05_2022/tekstovi_zadataka.txt
//        git commit -m “Predavanja 13.05 Git Zadatak 1”
//        git push
//
//
//        zamena za vise git add-ova
//        git add . => sve promene baci u stage


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
        nizA.add(3);

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