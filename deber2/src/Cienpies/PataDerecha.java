package Cienpies;

public class PataDerecha implements IMovimiento {
    @Override
    public boolean mover() {
        System.out.println(" [Pata Der: Mueve] ");
        return true;
    }
}
