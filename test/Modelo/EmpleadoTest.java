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
public class EmpleadoTest {

    private Empleado instance;

    public EmpleadoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Empleado(
                "12345",
                "Samuel Paz",
                "Ingeniero",
                (byte) 3
        );
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNumeroIdentificacioni method,
     * of class Empleado.
     */
    @Test
    public void testGetNumeroIdentificacioni() {
        assertEquals("12345", instance.getNumeroIdentificacioni());
    }

    /**
     * Test of setNumeroIdentificacioni method,
     * of class Empleado.
     */
    @Test
    public void testSetNumeroIdentificacioni() {
        instance.setNumeroIdentificacioni("98765");

        assertEquals("98765", instance.getNumeroIdentificacioni());
    }

    /**
     * Test of getNombreCompleto method,
     * of class Empleado.
     */
    @Test
    public void testGetNombreCompleto() {
        assertEquals("Samuel Paz", instance.getNombreCompleto());
    }

    /**
     * Test of setNombreCompleto method,
     * of class Empleado.
     */
    @Test
    public void testSetNombreCompleto() {
        instance.setNombreCompleto("Carlos Perez");

        assertEquals("Carlos Perez", instance.getNombreCompleto());
    }

    /**
     * Test of getTituloProfesional method,
     * of class Empleado.
     */
    @Test
    public void testGetTituloProfesional() {
        assertEquals("Ingeniero", instance.getTituloProfesional());
    }

    /**
     * Test of setTituloProfesional method,
     * of class Empleado.
     */
    @Test
    public void testSetTituloProfesional() {
        instance.setTituloProfesional("Administrador");

        assertEquals("Administrador", instance.getTituloProfesional());
    }

    /**
     * Test of getAniosExperiencia method,
     * of class Empleado.
     */
    @Test
    public void testGetAniosExperiencia() {
        assertEquals((byte) 3, instance.getAniosExperiencia());
    }

    /**
     * Test of setAniosExperiencia method,
     * of class Empleado.
     */
    @Test
    public void testSetAniosExperiencia() {
        instance.setAniosExperiencia((byte) 5);

        assertEquals((byte) 5, instance.getAniosExperiencia());
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        String expResult = "Empleado{numeroIdentificacioni=12345, nombreCompleto=Samuel Paz, tituloProfesional=Ingeniero, aniosExperiencia=3}";

        String result = instance.toString();

        assertEquals(expResult, result);
    }

    /**
     * Test of getNumeroIdentificacion method,
     * of class Empleado.
     */
    @Test
    public void testGetNumeroIdentificacion() {
        assertEquals(" ", instance.getNumeroIdentificacion());
    }

}
