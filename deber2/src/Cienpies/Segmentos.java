package Cienpies;

public class Segmentos {

    private PataIzquierda[] patasIzquierdas;
    private PataDerecha[] patasDerechas;
    private Cola cola;

    public Segmentos() {
        this.patasIzquierdas = new PataIzquierda[2];
        this.patasDerechas = new PataDerecha[2];
        this.cola = new Cola();

        for (int i = 0; i < 2; i++) {
            patasIzquierdas[i] = new PataIzquierda();
            patasDerechas[i] = new PataDerecha();
        }
    }

    public PataIzquierda[] getPatasIzquierdas() {
        return patasIzquierdas;
    }

    public PataDerecha[] getPatasDerechas() {
        return patasDerechas;
    }

    public Cola getCola() {
        return cola;
    }
}
