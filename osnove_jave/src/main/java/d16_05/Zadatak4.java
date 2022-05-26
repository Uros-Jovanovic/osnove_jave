package d16_05;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /
//            Scanner s = new Scanner(System.in);
//        System.out.print("Unesite parametar N: ");
//        int n = s.nextInt();
//        System.out.print("Unesite parametar M: ");
//        String m = s.nextLine();
 stampanjeKaraktera(5, "/");

    }
    static void stampanjeKaraktera(int n, String m){
        for (int i = 0 ; i < n ; i++){
            System.out.print(m + " ");
        }
    }
}
