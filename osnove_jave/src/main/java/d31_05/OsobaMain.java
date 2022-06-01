package d31_05;

public class OsobaMain {
    public static void main(String[] args) {
        Igrac i1 = new Igrac("Uros Jovanovic", "847143463",
                "24.04.1992.", 7, "napadac", true);
        Igrac i2 = new Igrac("Dejan Nikolic", "12311463",
                "11.02.1992.", 23, "odbrana", false);

        Trener t1 = new Trener("Ana Ilic", "215125155",
                "11.02.2000.", 3, "pomocni");
        Trener t2 = new Trener("Jelena Bakic", "1256652543",
                "16.06.1990.", 15, "kondicioni");

        t1.stampaj();
        t2.stampaj();
        i1.stampaj();
        i2.stampaj();
    }
}