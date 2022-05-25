package d18_05;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod kikiriki = new Proizvod();
        kikiriki.nazivProizvoda = "Gud kikiriki";
        kikiriki.cenaProizvoda = 152.5;
        kikiriki.tezinaProizvodaUGramima = 200;

        Proizvod smoki = new Proizvod();
        smoki.nazivProizvoda = "Smoki Stark";
        smoki.cenaProizvoda = 42.5;
        smoki.tezinaProizvodaUGramima = 50;

        kikiriki.stampaj();

        System.out.println();
        smoki.stampaj();
    }
}
