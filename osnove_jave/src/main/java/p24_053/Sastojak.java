package p24_053;

public class Sastojak {

//    Kreirati klasu Sastojak koja ima:
//    naziv sastojka
//    cenu
//    gettere i settere
//            konstuktore

    private String naziv;
    private int cena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
}
