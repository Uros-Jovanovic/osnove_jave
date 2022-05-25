package TEST;

public class Zadatak4 {
    public static void main(String[] args) {
        double novaVelicina = promena(3.5, "km");
        System.out.println("Nova velicina je: " + novaVelicina);

    }
 static double promena(double vrednost, String velicina){
        if ( velicina.equals("cm"))
        { return vrednost * 100;}
     else if ( velicina.equals("dm"))
     { return vrednost * 10;}
     else { return vrednost / 1000;}

 }
}
