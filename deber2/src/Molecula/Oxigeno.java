package Molecula;

public class Oxigeno implements IEnlace {

    protected int electrones;

    public Oxigeno() {
        this.electrones = 8;
    }

    @Override
    public boolean enlazar() {
        System.out.println("Átomo de Oxígeno enlazado al hidrogeno");
        return true;
    }

    public int getElectrones() {
        return electrones;
    }
}
