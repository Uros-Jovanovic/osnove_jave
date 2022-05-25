package p23_05;

public class Korisnik {
    private String ime;
    private String prezime;

    public Korisnik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Korisnik() {
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
 public void stampaj() {
     System.out.println("Ime korisnika je: " + this.ime);
     System.out.println("Prezime korisnika je: " + this.prezime);
 }

    }

