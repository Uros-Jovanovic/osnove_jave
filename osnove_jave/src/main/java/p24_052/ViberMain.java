package p24_052;

import p24_05.Korisnik;

public class ViberMain {
    public static void main(String[] args) {
        ViberKorisnik uros = new ViberKorisnik("Uros Jovanovic", 04564065, true);
        ViberKorisnik nikola = new ViberKorisnik("Nikola Nikolic", 045123065, true);

        ViberPoruka poruka = new ViberPoruka("Poruka bla bla", "22:22:22", uros);
        ViberReakcija reakcija = new ViberReakcija("smajlifejs", nikola);
        poruka.stampaj();

    }

}
