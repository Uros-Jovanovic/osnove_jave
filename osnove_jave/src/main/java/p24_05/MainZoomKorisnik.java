package p24_05;

public class MainZoomKorisnik {
    public static void main(String[] args) {

        Korisnik prvi = new Korisnik("Uros Jovanovic");
        ZoomCall one = new ZoomCall("klgsddjk", "qwe1230", prvi);
        one.setGuest(prvi);
       one.stampaj();
       prvi.pretplatiSe(150);
        System.out.println();
one.stampaj();

    }
}
