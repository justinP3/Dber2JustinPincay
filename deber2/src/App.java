public class App {
    public static void main(String[] args) throws Exception {
        Controller controlador = new Controller();

        System.out.println("=== Ejecutando Molecula de Agua ===");
        controlador.EjecutarMolecula();

        System.out.println("\n=== Ejecutando Arania ===");
        controlador.EjecutarArania();

        System.out.println("\n=== Ejecutando Cienpies ===");
        controlador.EjecutarCienpies();
    }
}
