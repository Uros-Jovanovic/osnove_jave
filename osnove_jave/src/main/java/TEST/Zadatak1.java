package TEST;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite major verziju instalirane aplikacije: ");
        double majorInstaled = s.nextDouble();
        System.out.print("Unesite minor verziju instalirane aplikacije: ");
        double minorInstaled = s.nextDouble();
        double instaliranaVerzija = majorInstaled + (minorInstaled / 10);
        System.out.println("Na racunaru je instalirana verzija " + instaliranaVerzija);
        System.out.print("Unesite major verziju najnovije aplikacije: ");
        double majorUpdated = s.nextDouble();
        System.out.print("Unesite minor verziju najnovije aplikacije: ");
        double minorUpdated = s.nextDouble();
        double updatovanaVerzija = majorUpdated + (minorUpdated / 10);
        System.out.println("Najnovija verzija je " + updatovanaVerzija);

        if (instaliranaVerzija < updatovanaVerzija) {
            System.out.println("Nova verzija aplikacije je dostupna za instalaciju.");}
        else {
            System.out.println("Vec imate najnoviju verziju na svom racunaru.");
        }
    }

}
