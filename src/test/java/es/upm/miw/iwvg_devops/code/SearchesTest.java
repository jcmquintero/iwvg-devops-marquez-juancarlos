package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindDecimalFractionByNegativeSignFraction() {
        assertEquals(List.of(-0.2, -0.5, -0.0), new Searches().findDecimalFractionByNegativeSignFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFractionAdditionByUserId() {
        assertEquals(3, new Searches().findFractionAdditionByUserId("1").getNumerator());
        assertEquals(1, new Searches().findFractionAdditionByUserId("1").getDenominator());
    }

}
