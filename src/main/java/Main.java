import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String cadena = "oso";
        System.out.println(esPalindromo(cadena));
    }
    public static boolean esPalindromo(String cadena){
        char[] cadenaArreglo = cadena.toCharArray();
        char[] resultado = new char[cadenaArreglo.length];

        for (int i = 0; i < cadenaArreglo.length; i++) {
            resultado[i] = cadenaArreglo[cadenaArreglo.length-i-1];
        }
        // Arrays.equeals ya que de lo contrario compararía en la memoria si son iguales
        return Arrays.equals(cadenaArreglo,resultado);
    }

}
