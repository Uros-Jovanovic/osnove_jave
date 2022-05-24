package p24_05;

public class Korisnik {
    private String imeIPrezime;
    private String tipLicence;

    public Korisnik(String imeIPrezime) {
        this.tipLicence = "basic";
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipLicence() {
        return this.tipLicence;
    }

    public void pretplatiSe(int suma) {
        if (suma == 100) {
            this.tipLicence = "pro";
        } else if (suma == 150) {
            this.tipLicence = "premium";
        }
    }

    public int duzinaCalla() {
        if (this.tipLicence.equals("basic")) {
            return 40;
        } else if (this.tipLicence.equals("pro")) {
            return 240;
        } else if (this.tipLicence.equals("premium")) {
            return 1440;
        } else {
            return 0;
        }

    }
}


