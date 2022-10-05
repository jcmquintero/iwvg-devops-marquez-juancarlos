package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsNotProper() {
        fraction = new Fraction(5, 3);
        assertFalse(fraction.isProper());
    }

    @Test
    void testIsNotImproper() {
        assertFalse(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction equivalentFraction = new Fraction(2, 8);
        assertTrue(fraction.isEquivalent(equivalentFraction));
    }

    @Test
    void testIsNotEquivalent() {
        Fraction notEquivalentFraction = new Fraction(3, 6);
        assertFalse(fraction.isEquivalent(notEquivalentFraction));
    }

    @Test
    void testAdd() {
        Fraction fractionToAdd = new Fraction(4, 7);
        Fraction result = fraction.add(fractionToAdd);
        assertEquals(23, result.getNumerator());
        assertEquals(28, result.getDenominator());
    }

    @Test
    void testAddDenominatorZero() {
        Fraction fractionToAdd = new Fraction(4, 0);
        Fraction result = fraction.add(fractionToAdd);
        assertNull(result);
    }

    @Test
    void testAddDenominatorEqual() {
        Fraction fractionToAdd = new Fraction(5, 4);
        Fraction result = fraction.add(fractionToAdd);
        assertEquals(6, result.getNumerator());
        assertEquals(4, result.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fractionToMultiply = new Fraction(4, 10);
        Fraction result = fraction.multiply(fractionToMultiply);
        assertEquals(4, result.getNumerator());
        assertEquals(40, result.getDenominator());
    }

    @Test
    void testMultiplyDenominatorZero() {
        Fraction fractionToMultiply = new Fraction(4, 0);
        Fraction result = fraction.multiply(fractionToMultiply);
        assertNull(result);
    }

    @Test
    void testDivide() {
        Fraction fractionToDivide = new Fraction(3, 5);
        Fraction result = fraction.divide(fractionToDivide);
        assertEquals(5, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    void testDivideDenominatorZero() {
        Fraction fractionToDivide = new Fraction(4, 0);
        Fraction result = fraction.divide(fractionToDivide);
        assertEquals(0, result.getNumerator());
        assertEquals(0, result.getDenominator());
    }

}
