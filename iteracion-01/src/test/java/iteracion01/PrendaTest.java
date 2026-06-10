package iteracion01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrendaTest {

    @Test
    void crearPrendaValida() {
        Prenda prenda = new Prenda(TipoDePrenda.REMERA, Tela.ALGODON, "azul");
        assertNotNull(prenda);
    }

    @Test
    void prendaTieneCategoriaDeSuTipo() {
        Prenda prenda = new Prenda(TipoDePrenda.REMERA, Tela.ALGODON, "azul");
        assertEquals(Categoria.PARTE_SUPERIOR, prenda.getTipo().getCategoria());
    }

    @Test
    void prendaSinTipoFalla() {
        assertThrows(NullPointerException.class, () ->
            new Prenda(null, Tela.ALGODON, "azul")
        );
    }

    @Test
    void prendaSinTelaFalla() {
        assertThrows(NullPointerException.class, () ->
            new Prenda(TipoDePrenda.REMERA, null, "azul")
        );
    }

    @Test
    void prendaSinColorPrimarioFalla() {
        assertThrows(NullPointerException.class, () ->
            new Prenda(TipoDePrenda.REMERA, Tela.ALGODON, null)
        );
    }

    @Test
    void colorSecundarioEsOpcional() {
        Prenda prenda = new Prenda(TipoDePrenda.REMERA, Tela.ALGODON, "azul");
        assertNull(prenda.getColorSecundario());
    }

    @Test
    void asignarColorSecundario() {
        Prenda prenda = new Prenda(TipoDePrenda.REMERA, Tela.ALGODON, "azul");
        prenda.setColorSecundario("blanco");
        assertEquals("blanco", prenda.getColorSecundario());
    }
}