package p16_05;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite pocetni broj zvezdica: ");
        int x = s.nextInt();
        int b = x -1 ;

        for (int i = 0; i < x && b!=-1; i++) {
            if (i < b ) {
                zvezdica(); }
            else { zvezdica();

                System.out.println("");
                i=-1;
                b--;}
        }
    }


    static void zvezdica() {
        System.out.print("* ");
    }
}