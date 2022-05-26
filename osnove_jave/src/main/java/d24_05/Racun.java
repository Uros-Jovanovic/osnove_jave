package d24_05;

public class Racun {
    //    metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.
    private String brojRacuna;
    private String imeIPrezime;
    private double trenutnoStanje;

    public Racun() {
    }

    public Racun(String brojRacuna, String imeIPrezime, double trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setTrenutnoStanje(double trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public double promeniStanje(double vrednostTransakcije) {
        if (vrednostTransakcije >= trenutnoStanje) {
            trenutnoStanje = trenutnoStanje + vrednostTransakcije;
        return trenutnoStanje; }
        return trenutnoStanje;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " rsd.");
    }
}
