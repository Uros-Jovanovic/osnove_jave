package d03_06;

import java.util.ArrayList;

public class AmbalazaMain {
    public static void main(String[] args) {
        StaklenaAmbalaza sok = new StaklenaAmbalaza("131-2131", "next sok",
                220.3, 132.5, 20, true, 150);
       StaklenaAmbalaza pivo = new StaklenaAmbalaza("654-612123", "lav pivo",
               213.4, 123.5, 50, true, 200);

       StaklenaAmbalaza voda = new StaklenaAmbalaza("745-1235", "rosa voda",
               250, 170, 30, true, 90);
       Tetrapak mleko = new Tetrapak("64-1354", "mleko kravica",
               500, 300, true, 178);
       Tetrapak vocniSok = new Tetrapak("1321-213", "narandza sok",
        1000, 200, false, 260);
       SuperKartica super1 = new SuperKartica("1313-3125", "Uros Jovanovic", 300);

       Korpa korpa1 = new Korpa();
       korpa1.dodajAmbalazu(voda);
       korpa1.dodajAmbalazu(mleko);
       korpa1.dodajAmbalazu(vocniSok);
       korpa1.cenaKorpe(super1);
        System.out.println(korpa1.cenaKorpe();
        //     U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i
//    istestirati sve metode i ispisati ukupnu cenu sa popustom.
    }
}
