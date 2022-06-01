package d31_05;

public class Igrac extends Osoba {

//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

 private int brojIgraca;
 private String pozicijaIgraca;
 private boolean daLiJeKapiten;

    public Igrac() {
    }
    public Igrac(String imeIPrezime, String jmbg, String datumRodjenja, int brojIgraca, String pozicijaIgraca, boolean daLiJeKapiten) {
        super(imeIPrezime, jmbg, datumRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicijaIgraca = pozicijaIgraca;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Pozicija igraca: " + this.pozicijaIgraca);
        System.out.println("Broj dresa igraca: " +this.brojIgraca );
        System.out.println("Da li je kapiten: " + this.daLiJeKapiten);
    }
}
