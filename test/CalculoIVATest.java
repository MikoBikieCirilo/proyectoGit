import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoIVATest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void precioVenta() {
        ProductoNormal pn1=new ProductoNormal(15.0); //creamos el primer objeto de ProductoNormal, le pasamos el valor del precio
        double expResult = 3.5;
        double result = CalculoIVA.PrecioVenta(pn1);
        assertEquals(expResult, result);
    }

    @Test
    void testPrecioVenta() {
        ProductoReducido pr=new ProductoReducido(15.0);
        double expResult = 1.5;
        double result = CalculoIVA.PrecioVenta(pr);
        assertEquals(expResult, result);

    }

    @Test
    void testPrecioVenta1() {
        ProductoSuperReducido psr=new ProductoSuperReducido(15.0);
        double expResult = 0.6;
        double result = CalculoIVA.PrecioVenta(psr);
        assertEquals(expResult, result);

    }
}