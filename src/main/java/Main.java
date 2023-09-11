import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String cadena = "000";
        System.out.println(esPalindromo(cadena));
    }
    public static boolean esPalindromo(String cadena){
        try{
            if(cadena.isEmpty()){
                throw new IllegalArgumentException("La cadena está vacía");
            }
           /* el \\ no me quedó tan claro la función que cumple pero es algo así como omitir los caracteres especiales, incluyendo el propio \ 
            y s+ se refiere a uno o mas espacios varios (los espacios vacios se son s, el siguiente parametro es el reemplazo, en este caso vacio*/
            char[] cadenaArreglo = cadena.replaceAll("\\s+", "").toLowerCase().toCharArray();
            char[] resultado = new char[cadenaArreglo.length];

            for (int i = 0; i < cadenaArreglo.length; i++) {
                resultado[i] = cadenaArreglo[cadenaArreglo.length-i-1];
            }
            // Arrays.equeals ya que de lo contrario compararía en la memoria si son iguales
            return Arrays.equals(cadenaArreglo,resultado);
        }catch (IllegalArgumentException iae){
            System.err.println("Error "+ iae.getMessage());
            return false;
        }
    }
}
