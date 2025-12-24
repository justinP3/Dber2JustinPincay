package Arania;

public class Patas {
    private int numeroPata;

    public Patas(int numero) {
        this.numeroPata = numero;
    }

    public boolean mover() {
        System.out.println("La pata " + numeroPata + " moviéndose.");
        return true;
    }
}
