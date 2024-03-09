import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }



@Test
    void calcularSuma(){
        double nume1=0.0;
        double nume2=0.0;
        double expResult = 0.0;
        double result = Calculadora.calculaSuma(nume1,nume2);
        assertEquals(expResult, result);
    }

    @Test
    void calcularResta(){
        double nume1=0.0;
        double nume2=0.0;
        double expResult = 0.0;
        double result = Calculadora.calculaResta(nume1,nume2);
        assertEquals(expResult, result);
    }

    @Test
    void calcularMultiplicacion(){
        double nume1=0.0;
        double nume2=0.0;
        double expResult = 0.0;
        double result = Calculadora.calculaMultiplicacion(nume1,nume2);
        assertEquals(expResult, result);
    }

    @Test
    void calcularDivision(){
        double nume1=0.0;
        double nume2=0.0;
        double expResult = 0.0;
        double result = Calculadora.calculaDivision(nume1,nume2);
        assertEquals(expResult, result);
    }


}