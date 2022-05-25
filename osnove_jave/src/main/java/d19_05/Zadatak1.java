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


        proizvodPrvi.stampaj();
        System.out.println();
        proizvodDrugi.stampaj();
     System.out.println();

        proizvodPrvi.povecanje(40);
        proizvodDrugi.smanjenje(30);

        proizvodPrvi.stampaj();
        System.out.println();
        proizvodDrugi.stampaj();
     System.out.println();


     System.out.println("Cena sa popustom za prvi proizvod je " + proizvodPrvi.smanjenje(30) + " dinara.");
        System.out.println("Cena sa popustom za drugi proizvod je " + proizvodDrugi.smanjenje(30)+ " dinara.");
        System.out.println();
        System.out.println("Postarina za prvi proizvod je " + proizvodPrvi.postarina());
        System.out.println("Postarina za drugi proizvod je " + proizvodDrugi.postarina());
    }
}
