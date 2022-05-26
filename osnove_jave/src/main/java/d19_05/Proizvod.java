package d19_05;

public class Proizvod {
    public String nazivProizvoda;
    public double cenaProizvoda;
    public double tezinaProizvoda;

    public Proizvod() {
    }

    public Proizvod(String nazivProizvoda, double cenaProizvoda, double tezinaProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
        this.cenaProizvoda = cenaProizvoda;
        this.tezinaProizvoda = tezinaProizvoda;
    }

    public void stampaj() {
        System.out.println(nazivProizvoda + ", " + cenaProizvoda + " dinara, " + tezinaProizvoda + "grama.");
    }

    public void povecanje(double poskupljenje) {
        this.cenaProizvoda = this.cenaProizvoda + poskupljenje;
    }

    public double vratiCenuSaPopustom(double popust) {
        double cenaSaPopustom = this.cenaProizvoda - this.cenaProizvoda * popust / 100;
    return  cenaSaPopustom;}

    public int postarina() {
        if (this.tezinaProizvoda <= 100) {
            return 200;
        } else if (this.tezinaProizvoda > 100 && this.tezinaProizvoda < 500) {
            return 400;
        } else {
            return 1000;
        }
    }

}
