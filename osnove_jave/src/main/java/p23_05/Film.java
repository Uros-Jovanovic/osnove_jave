package p23_05;

public class Film {

    private String naziv;
    private int godina;
    private Reziser reziser;

    public Film() {
    }

    public Film(String naziv, int godina) {
        this.naziv = naziv;
        this.godina = godina;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public int getGodina() {
        return this.godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Reziser getReziser() {
        return this.reziser;
    }

    public void setKoJeRezirao(Reziser reziser) {
        this.reziser = reziser;
    }

    public void stampaj() {
        System.out.println("Ime filma je " + this.naziv);
        System.out.println("Godina izdavanja je " + this.godina);
        this.reziser.stampaj();

    }
}
