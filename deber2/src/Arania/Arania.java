package Arania;

public class Arania {
    private Cabeza cabeza;
    private Torax torax;
    private Abdomen abdomen;

    public Arania() {
        this.cabeza = new Cabeza();
        this.torax = new Torax();
        this.abdomen = new Abdomen();
    }

    public Cabeza getCabeza() {
        return cabeza;
    }

    public Torax getTorax() {
        return torax;
    }

    public Abdomen getAbdomen() {
        return abdomen;
    }
}