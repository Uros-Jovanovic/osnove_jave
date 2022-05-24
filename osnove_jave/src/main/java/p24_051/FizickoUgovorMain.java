package p24_051;

public class FizickoUgovorMain {
    public static void main(String[] args) {
    FizickoLice uros = new FizickoLice("Uros Jovanovic", "25125", "1231", false);
    FizickoLice milan = new FizickoLice("Milan Jovanovic", "25325", "11131", true);

        Ugovor ugovor = new Ugovor(2022,4,20, uros, milan, 50000, "ITbootcamp 24");

        ugovor.stampaj();
    }
}
