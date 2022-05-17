package d16_05;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//        funkcije vraca novu vrednost koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
int noviBroj = dvocifreniBrojJe(3, 2);
        System.out.println("Dvocifreni broj je " + noviBroj);
    }

    static int dvocifreniBrojJe(int broj1, int broj2) {
        int s = 10 * broj1 + broj2;
        return s;
    }

}
