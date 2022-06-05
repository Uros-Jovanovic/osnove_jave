package d02_06;

import java.util.ArrayList;

public abstract class Radnik {
    protected String punoIme;
    protected ArrayList<Sektor> sektori = new ArrayList<>();

    public Radnik(String punoIme, ArrayList<Sektor> sektori) {
        this.punoIme = punoIme;
        this.sektori = sektori;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public ArrayList<Sektor> getSektori() {
        return sektori;
    }

    public void setSektori(ArrayList<Sektor> sektori) {
        this.sektori = sektori;
    }



    public abstract int plata ();
    public void zaposliUSektor(Sektor sektor){
        sektori.add(sektor);
    }
}
