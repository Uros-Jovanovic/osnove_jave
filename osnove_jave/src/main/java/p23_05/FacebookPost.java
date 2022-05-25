package p23_05;

public class FacebookPost {
    private String opis;
    private Korisnik autor;

    public FacebookPost() {
    }

    public FacebookPost(String opis, Korisnik autor) {
        this.opis = opis;
        this.autor = autor;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Korisnik getAutor() {
        return this.autor;
    }

    public void setAutor(Korisnik autor) {
        this.autor = autor;
    }

    public void stampaj() {
       this.autor.stampaj();
        System.out.println("Opis posta: " + this.opis);

    }
}