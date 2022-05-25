package p23_05;

public class Reziser {

    private String imeIPrezime;
    private int godine;

    public Reziser() {}

    public Reziser(String imeIprezime, int godine){
        this.imeIPrezime = imeIprezime;
        this.godine = godine;
    }


    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public int getGodine() {
        return this.godine;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void stampaj() {
        System.out.println("Ime rezisera je: " + this.imeIPrezime);
        System.out.println("Reziser ima " + this.godine + " godina.");

    }


}
