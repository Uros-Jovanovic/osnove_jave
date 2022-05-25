package p24_052;

public class ViberKorisnik {
//    ime i prezime
//    broj telefona
//    da li je trenutno aktivan (boolean)
//    gettere, settere, konstuktore
 private String imeIPrezime;
 private int brojTelefona;
 private boolean daLiJeAktivan;

    public ViberKorisnik(String imeIPrezime, int brojTelefona, boolean daLiJeAktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.daLiJeAktivan = daLiJeAktivan;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isDaLiJeAktivan() {
        return daLiJeAktivan;
    }

    public void setDaLiJeAktivan(boolean daLiJeAktivan) {
        this.daLiJeAktivan = daLiJeAktivan;
    }
}
