package d14_05;

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
        nizA.add(9);
        nizA.add(3);
        nizA.add(5);
        nizA.add(7);
        nizA.add(0);
        nizA.add(5);
        nizA.add(0);
        nizA.add(7);
        nizA.add(6);
        nizA.add(1);
        nizA.add(3);
        nizA.add(1);
        nizA.add(2);
        nizA.add(7);
        nizA.add(2);


        System.out.print("Unesite poziciju: ");
        int x = s.nextInt();
        int broj1 = 0;
        int broj2 = 0;
        int broj3 = 0;
        int broj4 = 0;
        int broj5 = 0;
        int zbir = 0;

        if (x >= 20) {
            broj1 = 0;
        } else {
            broj1 = x + 5;
        }
        if (x <= 5) {
            broj2 = 0;
        } else {
            broj2 = x - 5;
        }

        if ((x + 1 + 5) % 5 == 0) {
            broj3 = 0;
        } else {
            broj3 = x + 1;
        }
        if ((x+5) % 5 == 0) {
            broj4 = 0;
        } else {
            broj4 = x - 1;
        }
        if (x < 0 || x > 23) {
            broj5 = -2;
            broj4 = 0;
            broj3 = 0;
            broj2 = 0;
            broj1 = 0;
        } else {
            broj5 = x;
        }

        if (broj1 != 0 ) {
            broj1 = nizA.get(broj1);
        } else {
            broj1 = 0;
        }
        if (broj2 != 0) {
            broj2 = nizA.get(broj2); }
            else if (x==5) {
            broj2 = nizA.get(broj2); }
         else {
            broj2 = 0;
        }
        if (broj3 != 0) {
            broj3 = nizA.get(broj3);
        } else {
            broj3 = 0;
        }
        if (broj4 != 0) {
            broj4 = nizA.get(broj4);}
            else if (x==1) {
                broj2 = nizA.get(broj2); }
         else {
            broj4 = 0;
        }
        if (broj5 > -1 && broj5 < 25) {
            broj5 = nizA.get(broj5);
        } else {
            broj5 = 0;
        }
        zbir = broj1 + broj2 + broj3 + broj4 + broj5;
        System.out.println("Ukupan zbir je : " + zbir);

    }
}
