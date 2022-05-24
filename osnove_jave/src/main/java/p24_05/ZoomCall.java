package p24_05;

public class ZoomCall {
    //    Kreirati klasu ZoomCall koja ima:
//    link za poziv
//            password
//    korisnika koji je host
//    korisnika koji je guest
//    gettere za sve atribute
//    setter samo za guest-a
//    metodu pokreni poziv koja stampa podatke u formatu:
//    Zoom Call: url
    private String linkZaPoziv;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String linkZaPoziv, String password, Korisnik host) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.host = host;
    }

    public String getLinkZaPoziv() {
        return linkZaPoziv;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public Korisnik getGuest() {
        return guest;
    }

    public void stampaj(){
        System.out.println("Link za poziv " + this.linkZaPoziv);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getImeIPrezime());
        System.out.println("Guest: " + this.guest.getImeIPrezime());
        System.out.println("Maximalna duzina poziva");
        System.out.println(this.host.duzinaCalla());
    }
}
