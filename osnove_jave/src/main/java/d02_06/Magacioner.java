package d02_06;

public class Magacioner extends Radnik{

    public Magacioner(String punoIme) {
        super(punoIme);
    }
    private double prosecnaPlata(){
        double sumaPlata = 0;
        for (int i = 0; i < sektori.size(); i++) {
            sumaPlata += sektori.get(i).getPlata();

        }
        return sumaPlata / sektori.size()* 0.5;
    }

    @Override
    public double plata() {
       return prosecnaPlata() * sektori.size();
    }
}
