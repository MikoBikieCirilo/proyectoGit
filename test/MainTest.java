import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calcularMedia(){
        int[] valores = {5,5,5};
        double expResult = 5.0;
        double result = Main.calcularmedia(valores);
        assertEquals(expResult, result);

        // hacemos la segunda prueba

        valores[0]=7; //en la posicion de 0 y cada una de ellas le asignamos un valor distinto
        valores[1]=8;
        valores[2]=9;
        expResult=8.0;
        result = Main.calcularmedia(valores);
        assertEquals(expResult, result);

    }

    @Test
    void areaRectangulo(){
        double base=5.0;
        double altura=5.0;
        double expResult = 25.0;
        double result = Main.areaRectangulo(base,altura);
        assertEquals(expResult, result);

        //otra pueba
        base=10.0;
        altura=10.0;
        expResult=100.0;
        result = Main.areaRectangulo(base,altura);
        assertEquals(expResult, result);

    }

    void areaTriangulo(){
        double base=5.0;
        double altura=5.0;
        double expResult = 15.0;
        double result = Main.areaRectangulo(base,altura);
        assertEquals(expResult, result);
    }
}