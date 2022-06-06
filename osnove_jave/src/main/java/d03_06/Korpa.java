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



    private double vratiCenu(SuperKartica s1) {
        double cenaAmbalazeSaPopustom = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaAmbalazeSaPopustom = cenaAmbalazeSaPopustom + ambalaze.get(i).cenaArtikla() - s1.getPopust();
        }
        return cenaAmbalazeSaPopustom;
    }
    public double ukupnaCenaSaPopustom (SuperKartica s1){
       return vratiCenu(s1);
    }
        public void stampaj(){
            for (int i = 0; i < ambalaze.size(); i++) {
                System.out.println(ambalaze.get(i).getNazivArtikla() + " - " + ambalaze.get(i).cenaArtikla() + " din.");
            }
        }
}
