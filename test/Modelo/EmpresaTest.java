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
public class EmpresaTest {

    private Empresa instance;
    private Contacto contacto;

    public EmpresaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        contacto = new Contacto(
                "Samuel Paz",
                "Gerente",
                "3001234567",
                "samuel@gmail.com"
        );

        instance = new Empresa(
                contacto,
                "12345",
                "Empresa ABC",
                "Cali"
        );
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSuContacto method,
     * of class Empresa.
     */
    @Test
    public void testGetSuContacto() {
        assertEquals(contacto, instance.getSuContacto());
    }

    /**
     * Test of setSuContacto method,
     * of class Empresa.
     */
    @Test
    public void testSetSuContacto() {
        Contacto nuevoContacto = new Contacto(
                "Carlos Perez",
                "Administrador",
                "3109876543",
                "carlos@gmail.com"
        );

        instance.setSuContacto(nuevoContacto);

        assertEquals(nuevoContacto, instance.getSuContacto());
    }

    /**
     * Test of toString method,
     * of class Empresa.
     */
    @Test
    public void testToString() {
        String expResult = "Cliente{numeroIdentificacion=12345, nombre=Empresa ABC, nombreCiudad=Cali}"
                + "Empresa{suContacto=Contacto{nombreCompleto=Samuel Paz, Cargo=Gerente, numeroTelefono=3001234567, correoElectronico=samuel@gmail.com}}";

        String result = instance.toString();

        assertEquals(expResult, result);
    }

}
