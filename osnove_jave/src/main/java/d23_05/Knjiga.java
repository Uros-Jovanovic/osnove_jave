package d23_05;

public class Knjiga {
////-metodu print koja stampa u formatu (izbegavati dupliranje koda):
////            (ISBN)
////            (naziv) - (godina izdanja)
////    autor: (ime autora) (prezime autora)

    private int isbn;
    private String nazivKnjige;
    private int godinaIzadanja;
    private Autor autor;

    public Knjiga() {
    }

    public Knjiga(int isbn, String nazivKnjige, int godinaIzadanja, Autor autor) {
        this.isbn = isbn;
        this.nazivKnjige = nazivKnjige;
        this.godinaIzadanja = godinaIzadanja;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public int getGodinaIzadanja() {
        return godinaIzadanja;
    }

    public void setGodinaIzadanja(int godinaIzadanja) {
        this.godinaIzadanja = godinaIzadanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void stampaj() {
        System.out.println(this.isbn);
        System.out.println(this.nazivKnjige + " - " + this.godinaIzadanja);
        System.out.print("Autor: ");
        this.autor.stampaj();
    }
}

