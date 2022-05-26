package d24_05;

public class RacunTransakcijaMain {
    public static void main(String[] args) {
        Racun uros = new Racun("1231-123123-123", "Uros Jovanovic", 251255.2);
        Racun milan = new Racun("3215-12312-123", "Milan Milanovic", 542324.4);
        Transakcija transakcija1 = new Transakcija(123, uros, milan);
        uros.stampaj();
        System.out.println();
        milan.stampaj();

        transakcija1.izvrsiTransakciju(20000);
        System.out.println();
        uros.stampaj();
        System.out.println();
        milan.stampaj();
    }
}
