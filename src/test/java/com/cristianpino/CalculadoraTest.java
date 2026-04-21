package com.cristianpino;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void deberiaSumarDosNumerosCorrectamente() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void deberiaRestarDosNumerosCorrectamente() {
        assertEquals(2, calc.restar(5, 3));
    }

    @Test
    void deberiaDividirCorrectamente() {
        assertEquals(2, calc.dividir(4, 2));
    }

    @Test
    void deberiaLanzarExcepcionAlDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(4, 0));
    }
}