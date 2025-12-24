package Molecula;

public class MoleculaDeAgua {
    private Oxigeno atomoOxigeno;

    private Hidrogeno[] atomosHidrogeno;

    public MoleculaDeAgua() {

        this.atomoOxigeno = new Oxigeno();

        this.atomosHidrogeno = new Hidrogeno[2];
        this.atomosHidrogeno[0] = new Hidrogeno();
        this.atomosHidrogeno[1] = new Hidrogeno();

        System.out.println("--- Creando Molécula de Agua (H2O) ---");
    }

    public void formarEnlace() {

        boolean oxigenoListo = atomoOxigeno.enlazar();
        boolean h1Listo = atomosHidrogeno[0].enlazar();
        boolean h2Listo = atomosHidrogeno[1].enlazar();

        if (oxigenoListo && h1Listo && h2Listo) {
            System.out.println("¡Enlace exitoso! Se ha formado agua estable.");
        } else {
            System.out.println("Error en el enlace.");
        }
    }

    public void mostrarEstructura() {
        System.out.println("Estructura actual:");
        System.out.println("1x Oxígeno (" + atomoOxigeno.getElectrones() + " electrones)");
        System.out.println("2x Hidrógeno (" + atomosHidrogeno[0].getElectrones() + " electrón c/u)");
    }
}
