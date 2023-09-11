ejercicio palíndromos java


codigo javascript
function esPalindromo(cadena) {

    let resultado = "";
    
    resultado = cadena.split('').reverse().join('');
    
    return cadena === resultado;

}

inicializa una variable de tipo string.

luego con el paramatro de entrada "cadena" y el uso del metodo split(''), reverse() y join('') que convierten la cadena
a un arreglo para despues invertirla y finalmente hacerla cadena de nuevo.

finalmente retorna un booleano con la comparacion estricta cadena === resultado. que son la cadena original y la cadena
invertida.

un ejemplo puede ser ingresar "oso", lo que revolverá true, puesto a que se lee igual de ambos lados.

3.4 funciona para los casos de prueba "aca", "acas", "h"

4.1
