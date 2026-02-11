import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    @Test
    public void testEsPar() {
        Ejercicio2 ej2 = new Ejercicio2();
        assertTrue(ej2.esPar(2));
        assertTrue(ej2.esPar(0));
        assertFalse(ej2.esPar(3));
        assertFalse(ej2.esPar(-1));
    }
}
