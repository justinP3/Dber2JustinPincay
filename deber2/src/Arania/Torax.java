package Arania;

public class Torax {
    private Patas[] patas;

    public Torax() {
        this.patas = new Patas[8];

        for (int i = 0; i < patas.length; i++) {
            patas[i] = new Patas(i + 1);
        }
        for (Patas p : patas) {
            p.mover();
        }
    }

    public Patas[] getPatas() {
        return patas;
    }
}
