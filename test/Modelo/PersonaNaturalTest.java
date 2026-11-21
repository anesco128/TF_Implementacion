/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josef
 */
public class PersonaNaturalTest {

    private PersonaNatural instance;

    public PersonaNaturalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new PersonaNatural(
                "3001234567",
                "samuel@gmail.com",
                "12345",
                "Samuel Paz",
                "Cali"
        );
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNumeroTelefonico method,
     * of class PersonaNatural.
     */
    @Test
    public void testGetNumeroTelefonico() {
        assertEquals("3001234567", instance.getNumeroTelefonico());
    }

    /**
     * Test of setNumeroTelefonico method,
     * of class PersonaNatural.
     */
    @Test
    public void testSetNumeroTelefonico() {
        instance.setNumeroTelefonico("3109876543");

        assertEquals("3109876543", instance.getNumeroTelefonico());
    }

    /**
     * Test of getCorreoElectronico method,
     * of class PersonaNatural.
     */
    @Test
    public void testGetCorreoElectronico() {
        assertEquals("samuel@gmail.com", instance.getCorreoElectronico());
    }

    /**
     * Test of setCorreoElectronico method,
     * of class PersonaNatural.
     */
    @Test
    public void testSetCorreoElectronico() {
        instance.setCorreoElectronico("carlos@gmail.com");

        assertEquals("carlos@gmail.com", instance.getCorreoElectronico());
    }

    /**
     * Test of toString method,
     * of class PersonaNatural.
     */
    @Test
    public void testToString() {
        String expResult = "Cliente{numeroIdentificacion=12345, nombre=Samuel Paz, nombreCiudad=Cali}"
                + "PersonaNatural{numeroTelefonico=3001234567, correoElectronico=samuel@gmail.com}";

        String result = instance.toString();

        assertEquals(expResult, result);
    }

}
