package p23_05;

public class Kupac {
    private String punoIme;
    private Kartica kartica;

    public Kupac() {
    }
    public Kupac(Kartica kartica) {}

    public Kupac(String punoIme, Kartica kartica) {
        this.punoIme = punoIme;
        this.kartica = kartica;
    }

    public String getPunoIme() {
        return this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public Kartica getKartica() {
        return this.kartica;
    }

    public void setKartica(Kartica kartica) {
        this.kartica = kartica;
    }
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.getPunoIme());
    }
}
