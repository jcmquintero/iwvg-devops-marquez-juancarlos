package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 4);
    }

    @Test
    void testFraction() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testFractionGeneric() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(1);
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(3);
        assertEquals(3, fraction.getDenominator());
    }


    @Test
    void testDecimal() {
        assertEquals(0.25, fraction.decimal());
    }

    @Test
    void testToString() {
        String expectedString = "Fraction{" +
                "numerator=1" +
                ", denominator=4" +
                "}";
        assertEquals(expectedString, fraction.toString());
    }

}
