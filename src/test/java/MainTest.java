import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String cadenaVacia;
    String cadenaValida;
    int numero;
    String cadenaInvalida;
    String cadenaConEspacios;
    @BeforeEach
    void setUp() {
        cadenaVacia = "";
        cadenaValida = "aaabccbaaa";
        numero = 200;
        cadenaInvalida = "ahabccbaaa";
        cadenaConEspacios = "La tele letal";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void esPalindromo() {
        assertFalse(Main.esPalindromo(cadenaVacia));
        assertTrue(Main.esPalindromo(cadenaValida));
        assertFalse(Main.esPalindromo(String.valueOf(numero)));
        assertFalse(Main.esPalindromo(cadenaInvalida));
        assertTrue(Main.esPalindromo(cadenaConEspacios));


    }
}