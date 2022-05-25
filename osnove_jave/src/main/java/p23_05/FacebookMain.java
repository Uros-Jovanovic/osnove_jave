package p23_05;

public class FacebookMain {
    public static void main(String[] args) {
//        FacebookPost novipost = new FacebookPost();
//        novipost.setOpis("asdadjsda");
//
//        Korisnik noviKorisnik = new Korisnik();
//        noviKorisnik.setIme("Uros");
//        noviKorisnik.setPrezime("Jovanovic");
//        novipost.setAutor(noviKorisnik);
//        novipost.stampaj();

        Korisnik k = new Korisnik("Uros", "Jovanovic");
        FacebookPost p = new FacebookPost("Neki opis", k);
        FacebookPost f = new FacebookPost("Neki drugi opis", k);
        p.stampaj();
        f.stampaj();
    }
}
