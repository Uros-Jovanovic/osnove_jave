package d02_06;

public class Menadzer extends Radnik {

    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double plata() {
        double suma = 0;
        for (int i = 0; i < sektori.size(); i++) {
       suma+= sektori.get(i).getPlata();
        }
        return suma;
    }
}
