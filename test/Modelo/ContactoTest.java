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
public class ContactoTest {

    private Contacto instance;

    public ContactoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Contacto(
                "Samuel Paz",
                "Gerente",
                "3001234567",
                "samuel@gmail.com"
        );
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNombreCompleto method,
     * of class Contacto.
     */
    @Test
    public void testGetNombreCompleto() {
        assertEquals("Samuel Paz", instance.getNombreCompleto());
    }

    /**
     * Test of setNombreCompleto method,
     * of class Contacto.
     */
    @Test
    public void testSetNombreCompleto() {
        instance.setNombreCompleto("Carlos Perez");

        assertEquals("Carlos Perez", instance.getNombreCompleto());
    }

    /**
     * Test of getCargo method, of class Contacto.
     */
    @Test
    public void testGetCargo() {
        assertEquals("Gerente", instance.getCargo());
    }

    /**
     * Test of setCargo method, of class Contacto.
     */
    @Test
    public void testSetCargo() {
        instance.setCargo("Administrador");

        assertEquals("Administrador", instance.getCargo());
    }

    /**
     * Test of getNumeroTelefono method,
     * of class Contacto.
     */
    @Test
    public void testGetNumeroTelefono() {
        assertEquals("3001234567", instance.getNumeroTelefono());
    }

    /**
     * Test of setNumeroTelefono method,
     * of class Contacto.
     */
    @Test
    public void testSetNumeroTelefono() {
        instance.setNumeroTelefono("3109876543");

        assertEquals("3109876543", instance.getNumeroTelefono());
    }

    /**
     * Test of getCorreoElectronico method,
     * of class Contacto.
     */
    @Test
    public void testGetCorreoElectronico() {
        assertEquals("samuel@gmail.com", instance.getCorreoElectronico());
    }

    /**
     * Test of setCorreoElectronico method,
     * of class Contacto.
     */
    @Test
    public void testSetCorreoElectronico() {
        instance.setCorreoElectronico("carlos@gmail.com");

        assertEquals("carlos@gmail.com", instance.getCorreoElectronico());
    }

    /**
     * Test of toString method, of class Contacto.
     */
    @Test
    public void testToString() {
        String expResult = "Contacto{nombreCompleto=Samuel Paz, Cargo=Gerente, numeroTelefono=3001234567, correoElectronico=samuel@gmail.com}";

        String result = instance.toString();

        assertEquals(expResult, result);
    }

}
