package d30_05;

public class IspitStudentMain {
    public static void main(String[] args) {

        Ispit ispit1 = new Ispit("Matematika", 8, "Dejan Dejanovic");
        Ispit ispit2 = new Ispit("Fizika", 9, "Ana Ilic");

        Student student1 = new Student();
        student1.setImeIPrezime("Uros Jovanovic");
        student1.setTipStudija("osnovne");
        student1.setBrojIndeksa(79879);

        Student student2 = new Student();
        student2.setImeIPrezime("Petar Petrovic");
        student2.setTipStudija("master");
        student2.setBrojIndeksa(7231);

        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);

        student1.stampaj();

        student1.racunajProsek();

    }
}
