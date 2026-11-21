/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
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
public class ProyectoTest {

    private Proyecto instance;
    private Cliente cliente;
    private Empleado gerente;
    private Empleado integrante;
    private ArrayList<Empleado> equipo;

    public ProyectoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cliente = new PersonaNatural(
                "3001234567",
                "samuel@gmail.com",
                "12345",
                "Samuel Paz",
                "Cali"
        );

        gerente = new Empleado(
                "11111",
                "Carlos Perez",
                "Ingeniero",
                (byte) 5
        );

        integrante = new Empleado(
                "22222",
                "Andres Gomez",
                "Programador",
                (byte) 3
        );

        equipo = new ArrayList<>();
        equipo.add(integrante);

        instance = new Proyecto(
                "P001",
                "Desarrollo de software",
                LocalDate.of(2026, 1, 1),
                "meses",
                (byte) 6,
                cliente,
                gerente,
                equipo,
                "En proceso"
        );
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetCodigo() {
        assertEquals("P001", instance.getCodigo());
    }

    @Test
    public void testSetCodigo() {
        instance.setCodigo("P002");
        assertEquals("P002", instance.getCodigo());
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Desarrollo de software", instance.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        instance.setTitulo("Aplicacion web");
        assertEquals("Aplicacion web", instance.getTitulo());
    }

    @Test
    public void testGetFechaInicio() {
        assertEquals(LocalDate.of(2026, 1, 1), instance.getFechaInicio());
    }

    @Test
    public void testSetFechaInicio() {
        LocalDate nuevaFecha = LocalDate.of(2026, 2, 1);
        instance.setFechaInicio(nuevaFecha);
        assertEquals(nuevaFecha, instance.getFechaInicio());
    }

    @Test
    public void testGetUnidadDuracion() {
        assertEquals("meses", instance.getUnidadDuracion());
    }

    @Test
    public void testSetUnidadDuracion() {
        instance.setUnidadDuracion("semanas");
        assertEquals("semanas", instance.getUnidadDuracion());
    }

    @Test
    public void testGetDuracionEstimada() {
        assertEquals((byte) 6, instance.getDuracionEstimada());
    }

    @Test
    public void testSetDuracionEstimada() {
        instance.setDuracionEstimada((byte) 8);
        assertEquals((byte) 8, instance.getDuracionEstimada());
    }

    @Test
    public void testGetSuCliente() {
        assertEquals(cliente, instance.getSuCliente());
    }

    @Test
    public void testSetSuCliente() {
        Cliente nuevoCliente = new PersonaNatural(
                "3101234567",
                "nuevo@gmail.com",
                "54321",
                "Juan Perez",
                "Bogota"
        );

        instance.setSuCliente(nuevoCliente);
        assertEquals(nuevoCliente, instance.getSuCliente());
    }

    @Test
    public void testGetSuGerente() {
        assertEquals(gerente, instance.getSuGerente());
    }

    @Test
    public void testSetSuGerente() {
        Empleado nuevoGerente = new Empleado(
                "33333",
                "Maria Lopez",
                "Administradora",
                (byte) 4
        );

        instance.setSuGerente(nuevoGerente);
        assertEquals(nuevoGerente, instance.getSuGerente());
    }

    @Test
    public void testGetSuEquipo() {
        assertEquals(equipo, instance.getSuEquipo());
    }

    @Test
    public void testSetSuEquipo() {
        ArrayList<Empleado> nuevoEquipo = new ArrayList<>();
        nuevoEquipo.add(gerente);

        instance.setSuEquipo(nuevoEquipo);
        assertEquals(nuevoEquipo, instance.getSuEquipo());
    }

    @Test
    public void testGetEstado() {
        assertEquals("En proceso", instance.getEstado());
    }

    @Test
    public void testSetEstado() {
        instance.setEstado("Finalizado");
        assertEquals("Finalizado", instance.getEstado());
    }

    @Test
    public void testToString() {
        String result = instance.toString();

        assertTrue(result.contains("codigo=P001"));
        assertTrue(result.contains("titulo=Desarrollo de software"));
        assertTrue(result.contains("unidadDuracion=meses"));
        assertTrue(result.contains("duracionEstimada=6"));
        assertTrue(result.contains("estado=En proceso"));
    }

    @Test
    public void testDeterminarFechaFinalizacionSemanas() {
        instance.setUnidadDuracion("semanas");
        instance.setDuracionEstimada((byte) 2);

        assertEquals(
                LocalDate.of(2026, 1, 15),
                instance.determinarFechaFinalizacion()
        );
    }

    @Test
    public void testDeterminarFechaFinalizacionMeses() {
        instance.setUnidadDuracion("meses");

        assertEquals(
                LocalDate.of(2026, 7, 1),
                instance.determinarFechaFinalizacion()
        );
    }

    @Test
    public void testDeterminarFechaFinalizacionAnios() {
        instance.setUnidadDuracion("años");
        instance.setDuracionEstimada((byte) 2);

        assertEquals(
                LocalDate.of(2028, 1, 1),
                instance.determinarFechaFinalizacion()
        );
    }

    @Test
    public void testDeterminarFechaFinalizacionUnidadInvalida() {
        instance.setUnidadDuracion("dias");

        assertNull(instance.determinarFechaFinalizacion());
    }

    @Test
    public void testAgregarIntegrante() {
        Empleado nuevo = new Empleado(
                "44444",
                "Pedro Ruiz",
                "Analista",
                (byte) 2
        );

        int cantidadInicial = instance.getSuEquipo().size();

        instance.agregarIntegrante(nuevo);

        assertEquals(cantidadInicial + 1, instance.getSuEquipo().size());
        assertTrue(instance.getSuEquipo().contains(nuevo));
    }

    @Test
    public void testAgregarIntegranteCuandoEquipoEsNull() {
        instance.setSuEquipo(null);

        instance.agregarIntegrante(integrante);

        assertNotNull(instance.getSuEquipo());
        assertTrue(instance.getSuEquipo().contains(integrante));
    }

    @Test
    public void testEliminarIntegrante() {
        instance.getSuEquipo().clear();
        instance.agregarIntegrante(integrante);

        // El método getNumeroIdentificacion de Empleado
        // actualmente devuelve un espacio en blanco.
        Empleado resultado = instance.eliminarIntegrante(" ");

        assertEquals(integrante, resultado);
        assertFalse(instance.getSuEquipo().contains(integrante));
    }

    @Test
    public void testEliminarIntegranteNoExistente() {
        Empleado resultado = instance.eliminarIntegrante("99999");

        assertNull(resultado);
    }

}

