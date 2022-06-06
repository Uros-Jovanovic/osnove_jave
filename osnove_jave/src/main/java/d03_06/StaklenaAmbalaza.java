package d03_06;

public class StaklenaAmbalaza extends Ambalaza {


    private double kaucija;
    private boolean imaKauciju;
    private double osnovnaCena;

    public StaklenaAmbalaza(double kaucija, boolean imaKauciju, double osnovnaCena) {
        this.kaucija = kaucija;
        this.imaKauciju = imaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina,
                            double brutoTezina, double kaucija, boolean imaKauciju, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.imaKauciju = imaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isImaKauciju() {
        return imaKauciju;
    }

    public void setImaKauciju(boolean imaKauciju) {
        this.imaKauciju = imaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public void stampaj() {
        System.out.println(this.barkod + " - " + this.nazivArtikla + " - " + this.netoTezina + " - " + this.brutoTezina
                + " - Da li ima kauciju: " + this.imaKauciju + "Ako ima kauciju, cena kaucije je: " +  this.kaucija +
                this.osnovnaCena );
    }
    @Override
    public double cenaArtikla() {
        if ( imaKauciju == true){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }
        else {
            return this.osnovnaCena * 1.2;
        }

    }

//    metoda stampaj stampa sve podatke iz klase staklena flasa.
}
