package d30_05;

import java.util.ArrayList;

public class Student {
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
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
    
