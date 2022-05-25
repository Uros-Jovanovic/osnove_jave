package p24_052;

public class ViberPoruka {
    //    tekst poruke
//    vreme kad je poslata poruka
//    korisnika koji je poslao poruku
//    korisnika kome je poslata poruka
//    gettere i setere i konstuktore
    private String poruka;
    private String vreme;
    private ViberKorisnik korisnik;
    private String reakcija;

    public ViberPoruka(String poruka, String vreme, ViberKorisnik korisnik) {
        this.poruka = poruka;
        this.vreme = vreme;
        this.korisnik = korisnik;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public ViberKorisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(ViberKorisnik korisnik) {
        this.korisnik = korisnik;
    }
//    From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//    To: [Ime i prezime korisnika kome je poslata]
//            [Tekst poruke] : [reakcija] from [korisnik koji je reagovao]

    public String aktivnost(){
        if (getKorisnik().isDaLiJeAktivan() == true){
            return "Active now";
        }
        return "Not Active";
    }

public void stampaj(){
    System.out.println("From: " + this.korisnik.getImeIPrezime() + "Active Now ili Not Active - at " + this.vreme + " "
    + this.poruka + " " );
    if (this.reakcija != null) {
        System.out.println(reakcija);
        System.out.println(korisnik);
    }
}

}


