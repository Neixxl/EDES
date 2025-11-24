public class Sumador {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int resultado = suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("Fin del programa.");
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
