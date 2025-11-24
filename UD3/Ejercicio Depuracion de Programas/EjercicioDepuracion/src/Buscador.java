public class Buscador {
    public static void main(String[] args) {
    int[] miArray = {23, 56, 12, 8, 34, 77, 9, 45, 22};
    int valorBuscado = 34;
    // Llamar al método de búsqueda
    int índice = búsquedaLineal(miArray, valorBuscado);
    // Mostrar el resultado
    if (índice != -1) {
    System.out.println("El valor " + valorBuscado + "se encontró en el índice " + índice);
    } else {
    System.out.println("El valor " + valorBuscado + "no se encontró en el arreglo.");
    }
    }
    // Método de búsqueda lineal
    public static int búsquedaLineal(int[] arrayNúmeros, int valor) {
    for (int i = 0; i < arrayNúmeros.length; i++) {
    if (arrayNúmeros[i] == valor) {
    return i; // El valor fue encontrado
    }
    }
    return -1; // El valor no fue encontrado
    }
    }