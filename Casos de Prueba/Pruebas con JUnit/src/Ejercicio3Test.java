import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    @Test
    public void testContarCaracteres() {
        Ejercicio3 ej3 = new Ejercicio3();
        assertEquals(3, ej3.contarCaracteres("banana", 'a'));
        assertEquals(0, ej3.contarCaracteres("hola", 'z'));
        assertEquals(1, ej3.contarCaracteres("Java", 'J'));
    }
}
