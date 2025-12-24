package Arania;

public class Cabeza {
    private Mandibula mandibula;

    public Cabeza() {
        this.mandibula = new Mandibula();
        mandibula.comer();
    }

    public Mandibula getMandibula() {
        return mandibula;
    }
}
