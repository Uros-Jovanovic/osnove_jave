package p23_05;

public class MainPriizvod {

    public static void main(String[] args) {

        Kartica k = new Kartica(10, "213545155");
        Kupac q = new Kupac("Uros Jovanovic", k);
        Proizvod p = new Proizvod("Cokolada", 450, q);
        p.stampaj();
    }
}
