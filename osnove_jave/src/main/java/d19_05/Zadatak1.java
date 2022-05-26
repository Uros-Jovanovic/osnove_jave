package d19_05;

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod proizvodPrvi = new Proizvod();
        proizvodPrvi.nazivProizvoda = "Cigarete";
        proizvodPrvi.cenaProizvoda = 340.00;
        proizvodPrvi.tezinaProizvoda = 50.00;

        Proizvod proizvodDrugi = new Proizvod();
        proizvodDrugi.nazivProizvoda = "Keks";
        proizvodDrugi.cenaProizvoda = 130.00;
        proizvodDrugi.tezinaProizvoda = 200.00;

        double novaCena = proizvodPrvi.vratiCenuSaPopustom(20);

        proizvodPrvi.stampaj();
        proizvodDrugi.stampaj();
        proizvodPrvi.povecanje(40);
        System.out.println();
        proizvodPrvi.stampaj();
        System.out.println("Cena sa popustom je " + novaCena);
        System.out.println();
        System.out.println("Postarina za prvi proizvod je " + proizvodPrvi.postarina());
        System.out.println("Postarina za drugi proizvod je " + proizvodDrugi.postarina());
    }
}
