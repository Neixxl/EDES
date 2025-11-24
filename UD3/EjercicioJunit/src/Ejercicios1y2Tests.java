import org.junit.Assert;
import org.junit.Test;

public class Ejercicios1y2Tests {

    @Test
    public void testEjercicio1() {
        Ejercicios1y2 miEjercicio1 = new Ejercicios1y2();
        Assert.assertTrue(miEjercicio1.esMayorDeEdad(20));
    }

    @Test
    public void testEjercicio2() {
        
        Assert.assertFalse(new Ejercicios1y2().esMayorDeEdad(16));
    }

}
