public class OperacionesCadenas {
public String concatenar(String str1, String str2) {
if (str1 == null) {
str1 = "";
}
if (str2 == null) {
str2 = "";
}
return str1 + str2;
}
public int contarCaracteres(String cadena) {
return cadena.length();
}
public boolean esPalindromo(String palabra) {
String reversa = new StringBuilder(palabra).reverse().toString();
return palabra.equalsIgnoreCase(reversa);
}
}