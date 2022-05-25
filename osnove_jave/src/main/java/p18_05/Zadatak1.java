package p18_05;

public class Zadatak1 {
    public static void main(String[] args) {

        Racun prvi = new Racun();
        prvi.ImeIPrezime = "Uros Jovanovic";
        prvi.brojRacuna = 7894;
        prvi.stanjeNaRacunu = 1000;


        System.out.println("Ime i prezime vlasnika: " + prvi.ImeIPrezime);
        System.out.println("Racun vlasnika: " + prvi.brojRacuna);
        System.out.println("Stanje na racunu: " + prvi.stanjeNaRacunu);


        Racun drugi = new Racun();
        drugi.ImeIPrezime = "Jovan Jovanovic";
        drugi.brojRacuna = 2155;
        drugi.stanjeNaRacunu = 2000;
        System.out.println("Ime i prezime vlasnika: " + drugi.ImeIPrezime);
        System.out.println("Racun vlasnika: " + drugi.brojRacuna);
        System.out.println("Stanje na racunu: " + drugi.stanjeNaRacunu);

    }
}
