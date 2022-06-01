package p31_05.ProbniZadaciSaTesta;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite tezinu osobe (kg): ");
        double tezina = s.nextDouble();
        System.out.print("Unesite visinu osobe (m): ");
        double visina = s.nextDouble();
        double bmi = tezina / (visina * visina);
        if (bmi < 18.5) {
            System.out.println("Neuhranjenost");
        } else if (bmi >= 18.5 && bmi <= 24.99) {
            System.out.println("Normalna tezina");
        } else if (bmi >= 25 && bmi <= 29.99) {
            System.out.println("Prekomerna tezina");
        } else {
            System.out.println("Gojaznost");
        }
    }
}
