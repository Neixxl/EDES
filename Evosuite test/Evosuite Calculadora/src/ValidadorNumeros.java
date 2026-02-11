public class ValidadorNumeros {
public boolean esNumeroPositivo(int num) {
return num > 0;
}
public boolean esPar(int num) {
return num % 2 == 0;
}
public boolean esPrimo(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
return false;
}
}
return true;
}
}