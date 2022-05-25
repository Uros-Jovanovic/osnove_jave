package p23_05;

public class Kartica {

    private double popust;
    private String brojKartice;

    public Kartica() {
    }

    public Kartica(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public double getPopust() {
        return this.popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;

    }

    public String getBrojKartice() {
        return this.brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }
}
