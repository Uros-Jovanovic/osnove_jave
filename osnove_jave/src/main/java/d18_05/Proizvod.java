package d18_05;

public class Proizvod {

    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaProizvodaUGramima;



 public void stampaj() {
     System.out.println("Naziv proizvoda: " + this.nazivProizvoda);
     System.out.println("Cena proizvoda: " + this.cenaProizvoda + " dinara.");
     System.out.println("Tezina proizvoda: " + this.tezinaProizvodaUGramima + " grama.");


 }
}