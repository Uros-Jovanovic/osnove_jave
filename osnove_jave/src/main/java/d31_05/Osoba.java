package d31_05;

public class Osoba {



    protected String imeIPrezime;
    protected String jmbg;
    protected String datumRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIPrezime, String jmbg, String datumRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.datumRodjenja);
    }
}
