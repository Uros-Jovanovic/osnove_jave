package d03_06;

public class Tetrapak extends Ambalaza {

     private boolean recikliraSe;
     private double osnovnaCena;

    public Tetrapak(boolean recikliraSe, double osnovnaCena) {
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean recikliraSe, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public void setRecikliraSe(boolean recikliraSe) {
        this.recikliraSe = recikliraSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if ( recikliraSe == true){
            return tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }
        else {
            return osnovnaCena;}
        }
    @Override
    public void stampaj() {
        System.out.println(this.barkod + " - " + this.nazivArtikla + " - " + this.netoTezina + " - " + this.brutoTezina
                + " - Da li se reciklira: " + this.recikliraSe + " - " + this.osnovnaCena );
    }
}
