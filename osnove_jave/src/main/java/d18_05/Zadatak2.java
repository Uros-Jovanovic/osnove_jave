package d18_05;

public class Zadatak2 {
    public static void main(String[] args) {

        SmartAirConditioning klimaUredjajPrvi = new SmartAirConditioning();
        klimaUredjajPrvi.markaKlime = "Samsung";
        klimaUredjajPrvi.izabranaTemperatura = 17;
        klimaUredjajPrvi.mod = "hladi";

        SmartAirConditioning klimaUredjajDrugi = new SmartAirConditioning();
        klimaUredjajDrugi.markaKlime = "Beko";
        klimaUredjajDrugi.izabranaTemperatura = 30;
        klimaUredjajDrugi.mod = "greje";



        klimaUredjajPrvi.stampa();
        System.out.println();
        klimaUredjajDrugi.stampa();


    }
}
