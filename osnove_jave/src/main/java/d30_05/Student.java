package d30_05;

import java.util.ArrayList;

public class Student {
    private int brojIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student() {
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit (Ispit ispit){
        this.ispiti.add(ispit);
    }

    public void racunajProsek (){
       int ukupnaOcena = 0;
       int polozili = 0;
       int prosek = 0;

        for (int i = 0; i < ispiti.size() ; i++) {
            if ( ispiti.get(i).getOcena() > 5){
                polozili++;
                ukupnaOcena = ukupnaOcena + ispiti.get(i).getOcena();}
            }
        prosek = ukupnaOcena / polozili;
        }
        public void stampaj(){
            System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
            for (int i = 0; i < ispiti.size(); i++) {
                System.out.println(this.ispiti.get(i).getNazivPredmeta() + " - " + this.ispiti.get(i).getImeIPrezimeProfesora()
            + " Ocena: " +this.ispiti.get(i).getOcena());
            }
    }
    }

