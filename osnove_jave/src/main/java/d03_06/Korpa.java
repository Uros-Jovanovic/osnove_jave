package d03_06;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();
    public Korpa() {
    }

    public Korpa(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    public void dodajAmbalazu(Ambalaza a){
        ambalaze.add(a);
    }
    public void izbaciAmbalazu(String barkod){
        int brojac = 0;

        for (int i = 0; i < ambalaze.size() ; i++) {
            if (ambalaze.get(i).getBarkod().equals(barkod)){
                brojac = i;
            }
        }
        ambalaze.remove(brojac);
    }
    private double vratiCenu(double popust){
        double cenaAmbalazeSaPopustom = 0;
        for (int i = 0; i < ambalaze.size() ; i++) {
            cenaAmbalazeSaPopustom = cenaAmbalazeSaPopustom + ambalaze.get(i).cenaArtikla() - popust;
        }
        return cenaAmbalazeSaPopustom;
    }
    public double cenaKorpe(SuperKartica s1){
      return vratiCenu(s1.getPopust());
    }
}
