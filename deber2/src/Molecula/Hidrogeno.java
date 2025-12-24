package Molecula;

public class Hidrogeno implements IEnlace {
    protected int electrones;

    public Hidrogeno() {
        this.electrones = 1;
    }

    @Override
    public boolean enlazar() {
        System.out.println("Átomo de Hidrógeno se enlaza con el oxigeno.");
        return true;
    }

    public int getElectrones() {
        return electrones;
    }
}
