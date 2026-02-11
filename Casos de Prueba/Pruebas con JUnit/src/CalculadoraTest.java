import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testOperaciones() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(1, calc.restar(3, 2));
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
