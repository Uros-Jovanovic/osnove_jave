package p23_05;

public class FilmReziserMain {
    public static void main(String[] args) {


        Film film = new Film();
        film.setNaziv("Neki film");
        film.setGodina(1990);


        Reziser reziser = new Reziser();
        reziser.setImeIPrezime("Uros Jovanovic");
        reziser.setGodine(30);


        film.setKoJeRezirao(reziser);
        film.stampaj();
    }
}
