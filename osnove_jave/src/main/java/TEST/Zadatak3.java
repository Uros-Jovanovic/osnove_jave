package TEST;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean lozinkaJeDobra = false;

        while (lozinkaJeDobra == false) {
            System.out.print("Unesite lozinku: ");
            String lozinka = s.nextLine();
            if (lozinka.length() > 7 && (lozinka.contains("#") || lozinka.contains("@"))) {
                lozinkaJeDobra = true;
                System.out.println("Lozinka je validna");
            } else {
                System.out.println("Vasa lozinka nije ispravna");
            }
        }
    }
}
