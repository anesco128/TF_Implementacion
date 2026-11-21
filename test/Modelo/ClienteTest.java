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
public class ClienteTest {

    private Cliente instance;

    public ClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new ClienteImpl("12345", "Samuel", "Cali");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNumeroIdentificacion method,
     * of class Cliente.
     */
    @Test
    public void testGetNumeroIdentificacion() {
        assertEquals("12345", instance.getNumeroIdentificacion());
    }

    /**
     * Test of setNumeroIdentificacion method,
     * of class Cliente.
     */
    @Test
    public void testSetNumeroIdentificacion() {
        instance.setNumeroIdentificacion("98765");

        assertEquals("98765", instance.getNumeroIdentificacion());
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        assertEquals("Samuel", instance.getNombre());
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        instance.setNombre("Andres");

        assertEquals("Andres", instance.getNombre());
    }

    /**
     * Test of getNombreCiudad method,
     * of class Cliente.
     */
    @Test
    public void testGetNombreCiudad() {
        assertEquals("Cali", instance.getNombreCiudad());
    }

    /**
     * Test of setNombreCiudad method,
     * of class Cliente.
     */
    @Test
    public void testSetNombreCiudad() {
        instance.setNombreCiudad("Bogota");

        assertEquals("Bogota", instance.getNombreCiudad());
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        String expResult = "Cliente{numeroIdentificacion=12345, nombre=Samuel, nombreCiudad=Cali}";

        String result = instance.toString();

        assertEquals(expResult, result);
    }

    /**
     * Clase hija para instanciar la clase abstracta Cliente.
     */
    private static class ClienteImpl extends Cliente {

        public ClienteImpl(String numeroIdentificacion,
                           String nombre,
                           String nombreCiudad) {

            super(numeroIdentificacion, nombre, nombreCiudad);
        }
    }

}