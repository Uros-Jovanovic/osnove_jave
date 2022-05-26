package d24_05;

public class Transakcija {

    private int idTransakcije;
    private Racun racunSaKogSePrenosi;
    private Racun racunNaKojiSePrenosi;

    public Transakcija() {
    }

    public Transakcija(int idTransakcije, Racun racunSaKogSePrenosi, Racun racunNaKojiSePrenosi) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunSaKogSePrenosi() {
        return racunSaKogSePrenosi;
    }

    public void setRacunSaKogSePrenosi(Racun racunSaKogSePrenosi) {
        this.racunSaKogSePrenosi = racunSaKogSePrenosi;
    }

    public Racun getRacunNaKojiSePrenosi() {
        return racunNaKojiSePrenosi;
    }

    public void setRacunNaKojiSePrenosi(Racun racunNaKojiSePrenosi) {
        this.racunNaKojiSePrenosi = racunNaKojiSePrenosi;
    }

    double provizijaTransakcije = 0;

    public void izvrsiTransakciju(int vrednost) {
        if (this.racunSaKogSePrenosi.getTrenutnoStanje() < vrednost) {
            System.out.println("Nemate dovoljno novca na racunu za ovu transakciju.");
        } else {
            if (vrednost < 4500) {
                provizijaTransakcije = 45;
            } else {
                provizijaTransakcije = vrednost / 100;
            }
            this.racunSaKogSePrenosi.setTrenutnoStanje(racunSaKogSePrenosi.getTrenutnoStanje() - vrednost - provizijaTransakcije);
            this.racunNaKojiSePrenosi.setTrenutnoStanje(this.racunNaKojiSePrenosi.getTrenutnoStanje() + vrednost);
        }
    }
}