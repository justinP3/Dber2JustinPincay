package Cienpies;

public class Antenas implements IMovimiento {
    @Override
    public boolean mover() {
        System.out.println("Antenas moviendose para detectar el entorno.");
        return true;
    }
}
