package Cienpies;

public class Cabeza {

    private Antenas[] antenas;

    public Cabeza() {
        this.antenas = new Antenas[2];

        antenas[0] = new Antenas();
        antenas[1] = new Antenas();
    }

    public Antenas[] getAntenas() {
        return antenas;
    }
}