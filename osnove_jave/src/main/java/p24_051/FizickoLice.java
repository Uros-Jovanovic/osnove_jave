package p24_051;

public class FizickoLice {
    private String imeIPrezime;
    private String jmbg;
    private String brojLicneKarte;
    private boolean prethodnoKupovao;

    public FizickoLice(String imeIPrezime, String jmbg, String brojLicneKarte, boolean prethodnoKupovao) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.brojLicneKarte = brojLicneKarte;
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public void setBrojLicneKarte(String brojLicneKarte) {
        this.brojLicneKarte = brojLicneKarte;
    }

    public boolean isPrethodnoKupovao() {
        return prethodnoKupovao;
    }

    public void setPrethodnoKupovao(boolean prethodnoKupovao) {
        this.prethodnoKupovao = prethodnoKupovao;
    }

    public String getJmbg() {
        return jmbg;
    }
    public void stampaj()
    {
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Broj licne karte: " + this.brojLicneKarte);
    }
}
