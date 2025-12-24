package Cienpies;

import java.util.ArrayList;
import java.util.List;

public class Cienpies {
    private Cabeza cabeza;
    private List<Segmentos> listaSegmentos;

    public Cienpies(int cantidadSegmentos) {
        this.cabeza = new Cabeza();

        this.listaSegmentos = new ArrayList<>();
        if (cantidadSegmentos < 1)
            cantidadSegmentos = 1;

        for (int i = 0; i < cantidadSegmentos; i++) {
            this.listaSegmentos.add(new Segmentos());
        }
    }

    public Cabeza getCabeza() {
        return cabeza;
    }

    public List<Segmentos> getListaSegmentos() {
        return listaSegmentos;
    }
}