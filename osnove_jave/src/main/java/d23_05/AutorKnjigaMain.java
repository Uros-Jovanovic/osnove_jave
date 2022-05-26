package d23_05;

public class AutorKnjigaMain {
    public static void main(String[] args) {
        Autor uros = new Autor("Uros", "Jovanovic");
        Knjiga knjiga1 = new Knjiga(4797, "Gospodar poklona", 2022, uros);

        Autor karizi = new Autor("Donato", "Karizi");
        Knjiga knjiga2 = new Knjiga(9763, "Decak od stakla", 2005, karizi);

        knjiga1.stampaj();
        System.out.println();
        knjiga2.stampaj();
    }
}
