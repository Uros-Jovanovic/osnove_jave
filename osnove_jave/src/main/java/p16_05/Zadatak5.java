package p16_05;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vrednost a: ");
        int a = s.nextInt();
        System.out.print("Unesite vrednost b: ");
        int b = s.nextInt();

        int c = 5;
        int d = 6;
        operacija(2, 4);
        operacija(c, d);
        operacija(a, b);
    }


    static void operacija(int a, int b) {
        System.out.println("Zbir je: " + (a + b));
        System.out.println("Razlika je: " + (a - b));
        System.out.println("Proizvod je: " + a * b);
        System.out.println("Kolicnik je: " + a / b);


    }
}
