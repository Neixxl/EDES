import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    @Test
    public void testEsPositivo() {
        Ejercicio1 ej1 = new Ejercicio1();
        assertTrue(ej1.esPositivo(5));
        assertTrue(ej1.esPositivo(0));
        assertFalse(ej1.esPositivo(-3));
    }
}
