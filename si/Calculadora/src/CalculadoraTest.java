import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // EJERCICIO 1

    // Dos pruebas con assertEquals
    @Test
    void testSumar() {
        System.out.println("Prueba: Sumar 2 + 3 debe ser 5");
        assertEquals(5, Calculadora.sumar(2, 3), "La suma debería ser 5");
    }

    @Test
    void testRestar() {
        System.out.println("Prueba: Restar 10 - 4 debe ser 6");
        assertEquals(6, Calculadora.restar(10, 4), "La resta debería ser 6");
    }

    // Dos pruebas con assertNotEquals
    @Test
    void testMultiplicarNoIgual() {
        System.out.println("Prueba: Multiplicar 3 * 3 no debe ser 10");
        assertNotEquals(10, Calculadora.multiplicar(3, 3), "3*3 no debería ser 10");
    }

    @Test
    void testDividirNoIgual() {
        System.out.println("Prueba: Dividir 20 / 2 no debe ser 5");
        assertNotEquals(5, Calculadora.dividir(20, 2), "20/2 no debería ser 5");
    }

    // Prueba para división por cero (assertThrows)
    @Test
    void testDividirPorCero() {
        System.out.println("Prueba: Dividir por cero debe lanzar excepción");
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.dividir(10, 0);
        }, "Debería lanzar IllegalArgumentException al dividir por cero");
    }

    // EJERCICIO 2

    // Prueba assertEquals con delta
    @Test
    void testPotencia() {
        System.out.println("Prueba: 2 elevado a 3 debe ser 8.0");
        // Delta de 0.0001 para margen de error en doubles
        assertEquals(8.0, Calculadora.potencia(2.0, 3), 0.0001, "2^3 debería ser 8.0");
    }

    // Prueba assertNotEquals con delta
    @Test
    void testRaizCuadradaNoIgual() {
        System.out.println("Prueba: Raíz cuadrada de 25 no debe ser 4.0");
        // Verificamos que NO sea 4.0 (es 5.0)
        assertNotEquals(4.0, Calculadora.raizCuadrada(25.0), 0.0001, "La raíz de 25 no debería ser 4");
    }

    // Prueba raíz cuadrada de negativo
    @Test
    void testRaizCuadradaNegativa() {
        System.out.println("Prueba: Raíz de número negativo debe lanzar excepción");
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.raizCuadrada(-9.0);
        }, "Debería lanzar IllegalArgumentException con radicando negativo");
    }

    // Prueba para esPar usando assertTrue o assertFalse
    @Test
    void testEsPar() {
        System.out.println("Prueba: El número 4 debe ser par (true)");
        assertTrue(Calculadora.esPar(4), "4 debería ser considerado par");
    }
    
    @Test
    void testEsImpar() {
        System.out.println("Prueba: El número 7 debe ser impar (false)");
        assertFalse(Calculadora.esPar(7), "7 debería devolver false en esPar");
    }
}