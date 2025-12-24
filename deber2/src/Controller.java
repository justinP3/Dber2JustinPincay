import java.util.List;

import Arania.Arania;
import Cienpies.Antenas;
import Cienpies.Cienpies;
import Cienpies.PataDerecha;
import Cienpies.PataIzquierda;
import Cienpies.Segmentos;
import Molecula.MoleculaDeAgua;

public class Controller {

    public void EjecutarMolecula() {
        MoleculaDeAgua miMolecula = new MoleculaDeAgua();

        miMolecula.mostrarEstructura();
        System.out.println();

        miMolecula.formarEnlace();
        System.out.println();
    }

    public void EjecutarArania() {
        Arania arania = new Arania();

        arania.getAbdomen().lanzarTelarania();
        System.out.println();
        arania.getCabeza().getMandibula().comer();
        System.out.println();
    }

    public void EjecutarCienpies() {
        Cienpies miCiempies = new Cienpies(10);

        System.out.println("--- Sensando terreno ---");
        Antenas[] misAntenas = miCiempies.getCabeza().getAntenas();
        for (Antenas a : misAntenas) {
            a.mover();
        }

        System.out.println("--- Caminando ---");
        List<Segmentos> cuerpo = miCiempies.getListaSegmentos();

        int contador = 1;
        for (Segmentos seg : cuerpo) {
            System.out.println("Segmento " + contador + ":");

            for (PataIzquierda pIzq : seg.getPatasIzquierdas()) {
                pIzq.mover();
            }

            for (PataDerecha pDer : seg.getPatasDerechas()) {
                pDer.mover();
            }

            contador++;

        }
    }

}
