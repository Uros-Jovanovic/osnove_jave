package d20_05;

public class FacebookPost {
//    .Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//    ime i prezime korisnika koji je objavio post
//    ime i prezime korisnika na kom je profilu objavljen post
//            (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    tekst objave
//    broj lajkova
//    broj deljenja
 public String objavio;
 public String profil;
 public String tekst;
 public int likes;
 public int shares;

    public FacebookPost() {
    }
    public FacebookPost(String objavio, String profil, String tekst) {
        this.objavio = objavio;
        this.profil = profil;
        this.tekst = tekst;
    }
    public void lajkuj(){
        this.likes = this.likes + 1;}
    public void dislajkuj() {
        if (this.likes > 0) {
        this.likes = this.likes - 1;}
        else { this.likes = 0;}
    }
    public void sheruj(){
        this.shares++;
    }
    public void stampaj(){
        System.out.println(objavio + " >>> " + profil);
        System.out.println(tekst);
        System.out.println("Likes: " + this.likes + " |  Shares: " + this.shares);
    }
}

