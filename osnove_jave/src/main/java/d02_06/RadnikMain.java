package d02_06;

public class RadnikMain {
    public static void main(String[] args) {
//        U glavnom programu kreirati jednog magacionera i jednog menadzera,
//                postaviti sektore u kojima rade i ispisati platu za svakog
       Menadzer men1 = new Menadzer("Petar Petric");
       Magacioner mag1 = new Magacioner("Goran Goranovic");
       Sektor s1 = new Sektor("Sektor prvi", 50000);
       Sektor s2 = new Sektor("Sektor drugi", 70000);
       Sektor s3 = new Sektor("Sektor treci", 100000);

       mag1.zaposliUSektor(s1);
       mag1.zaposliUSektor(s2);
       mag1.zaposliUSektor(s3);
       men1.zaposliUSektor(s1);
       men1.zaposliUSektor(s2);
       men1.zaposliUSektor(s3);

       mag1.plata();
       men1.plata();

       System.out.println("Magacionareva plata je: " + mag1.plata());
       System.out.println("Menadzerova plata je: " + men1.plata());

    }
}
