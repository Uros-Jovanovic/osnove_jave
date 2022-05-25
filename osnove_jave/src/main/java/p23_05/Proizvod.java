package p23_05;

public class Proizvod {
    private String naziv;
    private int cenaIzrade;
    private Kupac kupac;

    public Proizvod() {
    }

    public Proizvod(String naziv, int cenaIzrade, Kupac kupac) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
        this.kupac = kupac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }
    public double racunajCenu(){
        return this.cenaIzrade *1.9 *(100 - this.kupac.getKartica().getPopust() / 100);
    }

    public void stampaj(){
        System.out.println(this.naziv + " - " + this.racunajCenu());
       this.kupac.stampaj();

    }
}
