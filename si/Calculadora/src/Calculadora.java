public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static double raizCuadrada(double radicando) {
        if (radicando < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo");
        }
        return Math.sqrt(radicando);
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}