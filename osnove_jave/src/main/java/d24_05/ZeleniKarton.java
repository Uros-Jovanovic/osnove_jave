package d24_05;

import java.security.spec.RSAOtherPrimeInfo;

public class ZeleniKarton {
    private String imeIPrezimeStudenta;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeiPrezimeProfesora;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String imeIPrezimeStudenta, int brojIndeksa, String nazivPredmeta, String imeiPrezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeiPrezimeProfesora = imeiPrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeiPrezimeProfesora() {
        return imeiPrezimeProfesora;
    }

    public void setImeiPrezimeProfesora(String imeiPrezimeProfesora) {
        this.imeiPrezimeProfesora = imeiPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean daLiJePolozen(){
        if (this.ocena > 5) {
            return true;
        } else {
            return false;
        }
    }
    //            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeiPrezimeProfesora);
    }
}
