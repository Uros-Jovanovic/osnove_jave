package d16_05;

public class Zadatak4 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/)
//        stampa se=>
/// / / / /
              stampanjeZnaka(6, "/");
    }

    static void stampanjeZnaka(int broj, String znak) {
        for (int i = 0; i < broj; i++) {
            System.out.print(znak + " ");
        }
    }
}