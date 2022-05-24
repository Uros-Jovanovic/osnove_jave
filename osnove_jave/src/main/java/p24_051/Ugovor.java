package p24_051;

import p24_05.Korisnik;

public class Ugovor {
    private int godina;
    private int mesec;
    private int dan;
    private FizickoLice kupac;
    private FizickoLice prodavac;
    private int cena;
    private String adresa;

    public Ugovor(int godina, int mesec, int dan, FizickoLice kupac, FizickoLice prodavac, int cena, String adresa) {
        this.godina = godina;
        this.mesec = mesec;
        this.dan = dan;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade(){
        return this.kupac.isPrethodnoKupovao()  ? 0.02 : 0.03;
        }


    public double zarada(){
        return 1000 + this.cena * procenatZarade();
    }
public void stampaj() {
    System.out.println("Dana " + this.dan + "." + this.mesec + "." + this.godina + "." + "sklopljen je ugovor izmedju " +
            this.prodavac.getImeIPrezime() + " i " + this.kupac.getImeIPrezime() + ", o kupovini nekretnine " + this.adresa + ", po ceni od " + this.cena
    + "pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + zarada() );
}
}

