package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;
    private List<Fraction> fractions;


    @BeforeEach
    void before() {

        Fraction fraction = new Fraction();
        fractions = new ArrayList<>();
        fractions.add(fraction);
        user = new User("001", "Juan Carlos", "Marquez", fractions);
    }


    @Test
    void testUser() {
        Assertions.assertEquals("001", user.getId());
        Assertions.assertEquals("Juan Carlos", user.getName());
        Assertions.assertEquals("Marquez", user.getFamilyName());
        Assertions.assertEquals(fractions, user.getFractions());
    }

    @Test
    void testUserGeneric() {
        user = new User();
        Assertions.assertNull(user.getId());
        Assertions.assertNull(user.getName());
        Assertions.assertNull(user.getFamilyName());
        Assertions.assertEquals(0, user.getFractions().size());
    }

    @Test
    void testGetId() {
        assertEquals("001", user.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Juan Carlos", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Juan");
        assertEquals("Juan", user.getName());
    }

    @Test
    void testAddFraction() {
        user.addFraction(new Fraction());
        Assertions.assertEquals(2, user.getFractions().size());
    }

    @Test
    void testGetFractions() {
        assertEquals(1, user.getFractions().size());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions = List.of(new Fraction(), new Fraction());
        user.setFractions(fractions);
        assertEquals(2, user.getFractions().size());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Marquez", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Quintero");
        assertEquals("Quintero", user.getFamilyName());
    }

    @Test
    void testFullName() {
        Assertions.assertEquals("Juan Carlos Marquez", user.fullName());
    }

    @Test
    void testInitials() {
        Assertions.assertEquals("J.", user.initials());
    }

    @Test
    void testToString() {
        String expectedString = "User{" +
                "id='001'" +
                ", name='Juan Carlos'" +
                ", familyName='Marquez'" +
                ", fractions=" + user.getFractions() +
                '}';
        assertEquals(expectedString, user.toString());
    }


}
