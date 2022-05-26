package d20_05;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost newPost1 = new FacebookPost("Uros Jovanovic", "Nikola Nikolic", "Sta se radi?");
        newPost1.lajkuj();
        newPost1.sheruj();
        newPost1.lajkuj();
        newPost1.dislajkuj();
        newPost1.lajkuj();
        newPost1.lajkuj();
        newPost1.sheruj();
        newPost1.sheruj();
        newPost1.sheruj();

        newPost1.stampaj();
        System.out.println();
        FacebookPost newPost2 = new FacebookPost("Petar Petrovic", "Tijana Tijanic", "Pozdrav");
        newPost2.lajkuj();
        newPost2.lajkuj();
        newPost2.lajkuj();
        newPost2.lajkuj();
        newPost2.lajkuj();
        newPost2.sheruj();
        newPost2.sheruj();
        newPost2.stampaj();


    }
}
