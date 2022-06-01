package d30_05;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imeIPrezimeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imeIPrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public boolean daLiJeIspitPolozen(int ocena) {
        this.ocena = ocena;
        boolean polozioJe;
        if (this.ocena > 5) {
            polozioJe = true;
        } else {
            polozioJe = false;
        }
        return polozioJe;
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.imeIPrezimeProfesora + " - " + this.ocena);
    }
}
