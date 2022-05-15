package d14_05;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zahtev: ");
        String Poruka = s.nextLine();
        boolean krajPrograma = false;

     while ( krajPrograma = false ) {

         if (Poruka.contains("Molim te")) {
            System.out.println("Dogovoreno"); }
         else if (Poruka.contains("Hvala!"))
         { krajPrograma = true;
             System.out.println("Cao"); }
             else { System.out.println("Unesite zahtev: ");
             Poruka = s.nextLine(); }


        }
    }
}