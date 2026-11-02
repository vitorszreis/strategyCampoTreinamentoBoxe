package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxeadorTest {

    @Test
    void deveCalcularCaloriasTreinoSaco() {
        Boxeador boxeador = new Boxeador();
        boxeador.treinarSaco(5);
        assertEquals(150.0f, boxeador.getCalorias());
    }

    @Test
    void deveCalcularCaloriasTreinoManopla() {
        Boxeador boxeador = new Boxeador();
        boxeador.treinarManopla(5);
        assertEquals(200.0f, boxeador.getCalorias());
    }

    @Test
    void deveCalcularCaloriasSparring() {
        Boxeador boxeador = new Boxeador();
        boxeador.fazerSparring(5);
        assertEquals(250.0f, boxeador.getCalorias());
    }

}
