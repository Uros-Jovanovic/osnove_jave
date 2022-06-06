package d03_06;

import java.util.ArrayList;

public class AmbalazaMain {
    public static void main(String[] args) {
        StaklenaAmbalaza sok = new StaklenaAmbalaza("131-2131", "Next sok",
                220.3, 218.5, 20, true, 150);
       StaklenaAmbalaza pivo = new StaklenaAmbalaza("654-612123", "Lav pivo",
               213.4, 210.5, 50, true, 200);

       StaklenaAmbalaza voda = new StaklenaAmbalaza("745-1235", "Rosa voda",
               250, 240, 30, true, 90);
       Tetrapak mleko = new Tetrapak("64-1354", "Mleko kravica",
               500, 495, true, 178);
       Tetrapak vocniSok = new Tetrapak("1321-213", "Narandza sok",
        1000, 988, false, 260);
       SuperKartica super1 = new SuperKartica("1313-3125", "Uros Jovanovic", 20);

       Korpa korpa1 = new Korpa();
       korpa1.dodajAmbalazu(voda);
       korpa1.dodajAmbalazu(mleko);
       korpa1.dodajAmbalazu(vocniSok);
       korpa1.ukupnaCenaSaPopustom(super1);
       korpa1.stampaj();
        System.out.println("Ukupna cena korpe je: " + korpa1.ukupnaCenaSaPopustom(super1));
        //     U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i
//    istestirati sve metode i ispisati ukupnu cenu sa popustom.
    }
}
