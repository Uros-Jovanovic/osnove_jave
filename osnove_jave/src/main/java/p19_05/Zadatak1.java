package p19_05;

public class Zadatak1 {
    public static void main(String[] args) {
        NovaKlasa u = new NovaKlasa();
        u.imeIPrezime = "Uros Jovanovic";
        u.godinaRodjenja = 1992;
        u.markaAutomobila = "Golf";
        u.daLiJeKlimaUkljucena = true;
        u.registracijaMesec = 11;
        u.godinaProizvodnje = 2007;
        u.kubikaza = 1900;
        u.brojVrata = 4;
        u.potrosnja = 7;
        u.brzina = 250;
       double cenaRRegistracije = u.Registracija();
        System.out.println("Cena registracije je: " + cenaRRegistracije + " dinara.");
        boolean autoJeOldTimer = u.daLiJeOldTimer();
        boolean registracijaJeIstekla = u.daLiJeRegistracijaIstekla(12);
        System.out.println("Da li registracija istekla: " +  registracijaJeIstekla);
        System.out.println("Da li je Old timer: " +  autoJeOldTimer);
        u.potrosnjaAutomobila();
        u.dodajGas();
        u.dodajGas();
        u.dodajGas();
        u.koci();
        u.koci();
        u.koci();
        u.koci();
        u.koci();
        u.koci();


        boolean x = u.daLiJePrekoracio(150);
        System.out.println("Da li je korisnik prekoracio brzinu:" + x);
      int kazna = u.prekoracenje(150);
        System.out.println("Kazna je: " + kazna +" dinara");
        u.stampa();


    }
}



