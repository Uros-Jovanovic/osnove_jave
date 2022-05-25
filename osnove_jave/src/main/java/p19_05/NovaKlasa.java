package p19_05;

public class NovaKlasa {
    public String imeIPrezime;
    public int godinaRodjenja;
    public double kapacitetRezervoara;

    public double tretnutnoURezervoaru;

    public int godinaProizvodnje;
    public int kubikaza;
    public int registracijaMesec;
    public boolean daLiJeKlimaUkljucena;
    public int brojRegistracije;
    public String markaAutomobila;
    public int brojVrata;
    public double potrosnja;
    public int brzina;

    public void stampa() {
        System.out.println("Ime i prezime: " + this.imeIPrezime);
        System.out.println("Godina rodjenja: " + this.godinaRodjenja);
        System.out.println("Godina proizvodnje: " + this.godinaProizvodnje);
        System.out.println("Kapacitet rezervoara: " + this.kapacitetRezervoara);
        System.out.println("Trenurno u rezervoaru: " + this.tretnutnoURezervoaru);
        System.out.println("Kubikaza: " + this.kubikaza);
        System.out.println("Registrovan do: " + this.registracijaMesec);
        System.out.println("Da li je klima ukljucena: " + this.daLiJeKlimaUkljucena);
        System.out.println("Marka automobila: " + this.markaAutomobila);
        System.out.println("Broj registracije : " + this.brojRegistracije);
        System.out.println("Broj vrata: " + this.brojVrata);
        System.out.println("Potrosnja: " + this.potrosnja);
        System.out.println("Brzina: " + this.brzina);
    }

    public boolean daLiJePrekoracio(int ogranicenje) {
        if (brzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public int prekoracenje(int ogranicenje) {
        int prekoracenje = brzina - ogranicenje;
        if (brzina <= ogranicenje) {
            prekoracenje = 0;
        }

        int kazna = prekoracenje * 1000;
        return kazna;
    }

    public void dodajGas() {
        this.brzina = this.brzina + 10;
    }

    public void koci() {
        if (brzina - 10 > 0) {
            this.brzina = this.brzina - 10;
        } else {
            this.brzina = 0;
        }
    }

    public double potrosnjaAutomobila() {
        if (this.daLiJeKlimaUkljucena == true) {
            this.potrosnja = this.brzina / 100 * 1.2;
            return this.potrosnja;
        } else {
            this.potrosnja = this.brzina / 100;
            return this.potrosnja;
        }


    }

    public boolean daLiJeOldTimer() {
        if (godinaProizvodnje < 1950) {
            return true;
        } else {
            return false;
        }
    }

    public boolean daLiJeRegistracijaIstekla(int trenutniMesec) {

        return registracijaMesec <= trenutniMesec;

    }

    public double Registracija() {
        if ((this.kubikaza) < 2000) {
            return 100 * kubikaza;
        } else {
            return 100 * kubikaza * 1.3;
        }

    }

    public double natociGorivo(double kolicina) {
        if (tretnutnoURezervoaru + kolicina <= kapacitetRezervoara) {
            return kolicina * 170;
        } else {
            return 0;
        }
    }
}