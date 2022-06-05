package d03_06;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza a) {
        ambalaze.add(a);
    }

    public void izbaciAmbalazu(String barkod) {
        int brojac = 0;

        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).getBarkod().equals(barkod)) {
                ambalaze.remove(i);
            }
        }
    }

    public double vratiCenu(SuperKartica s1) {
        double cenaAmbalazeSaPopustom = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaAmbalazeSaPopustom = cenaAmbalazeSaPopustom + ambalaze.get(i).cenaArtikla() - s1.getPopust();
        }
        return cenaAmbalazeSaPopustom;
    }

}
