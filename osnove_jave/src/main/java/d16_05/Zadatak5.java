package d16_05;

public class Zadatak5 {
    public static void main(String[] args) {
// (Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

izbroji(3, 7);
    }
    static void izbroji(int m, int n){
        int x = n - m - 1;
        System.out.println("Ukupno brojeva izmedju je " + x);
    }
}
