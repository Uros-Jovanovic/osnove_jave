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

        int sum = nizA.get(x+5) + nizA.get(x-5) + nizA.get(x+1) + nizA.get(x-1) + nizA.get(x);
        System.out.print ("Ukupna suma je:  " + sum);
    }
}
