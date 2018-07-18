/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juan-
 */
public class ProgramasExcelTest {
    
    public ProgramasExcelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of comprobarExcel method, of class ProgramasExcel.
     */
    @Test
    public void testComprobarExcel() throws Exception {
        System.out.println("comprobarExcel");
        ProgramasExcel instance = new ProgramasExcel();
        instance.comprobarExcel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CrearHoja method, of class ProgramasExcel.
     */
    @Test
    public void testCrearHoja() throws Exception {
        System.out.println("CrearHoja");
        String hoja = "";
        String nombre = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.CrearHoja(hoja, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peliculaExistente method, of class ProgramasExcel.
     */
    @Test
    public void testPeliculaExistente() throws Exception {
        System.out.println("peliculaExistente");
        String variable = "";
        String decision = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.peliculaExistente(variable, decision);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRow method, of class ProgramasExcel.
     */
    @Test
    public void testRemoveRow() {
        System.out.println("removeRow");
        Sheet sheet = null;
        int rowIndex = 0;
        ProgramasExcel instance = new ProgramasExcel();
        instance.removeRow(sheet, rowIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
                System.out.println("surnames");
        String m = "AAA";
        String M = "AAZ";

       
        assertEquals("AALMANZA", true);

    }

    /**
     * Test of removerFilaNombrePelicula method, of class ProgramasExcel.
     */
    @Test
    public void testRemoverFilaNombrePelicula() throws Exception {
        System.out.println("removerFilaNombrePelicula");
        String hoja = "";
        String palabra = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.removerFilaNombrePelicula(hoja, palabra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerFila method, of class ProgramasExcel.
     */
    @Test
    public void testRemoverFila() throws Exception {
        System.out.println("removerFila");
        String hoja = "";
        String palabra = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.removerFila(hoja, palabra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarPelicula method, of class ProgramasExcel.
     */
    @Test
    public void testEditarPelicula() throws Exception {
        System.out.println("EditarPelicula");
        ArrayList lista = null;
        String pelicula = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.EditarPelicula(lista, pelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of datosPelicula method, of class ProgramasExcel.
     */
    @Test
    public void testDatosPelicula() throws Exception {
        System.out.println("datosPelicula");
        String Pelicula = "";
        ProgramasExcel instance = new ProgramasExcel();
        ArrayList expResult = null;
        ArrayList result = instance.datosPelicula(Pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nombresHojas method, of class ProgramasExcel.
     */
    @Test
    public void testNombresHojas() throws Exception {
        System.out.println("nombresHojas");
        ProgramasExcel instance = new ProgramasExcel();
        ArrayList expResult = null;
        ArrayList result = instance.nombresHojas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirValorColumna method, of class ProgramasExcel.
     */
    @Test
    public void testAnadirValorColumna() throws Exception {
        System.out.println("anadirValorColumna");
        String hoja = "";
        String nombre = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.anadirValorColumna(hoja, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearColumna method, of class ProgramasExcel.
     */
    @Test
    public void testCrearColumna() throws Exception {
        System.out.println("crearColumna");
        String hoja = "";
        String nombre = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.crearColumna(hoja, nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarHoja method, of class ProgramasExcel.
     */
    @Test
    public void testComprobarHoja() {
        System.out.println("comprobarHoja");
        String hoja = "";
        ProgramasExcel instance = new ProgramasExcel();
        boolean expResult = false;
        boolean result = instance.comprobarHoja(hoja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarNombre method, of class ProgramasExcel.
     */
    @Test
    public void testEditarNombre() throws Exception {
        System.out.println("editarNombre");
        String hoja = "";
        String palabra = "";
        String nuevaPalabra = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.editarNombre(hoja, palabra, nuevaPalabra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarColumnaPelicula method, of class ProgramasExcel.
     */
    @Test
    public void testComprobarColumnaPelicula() throws Exception {
        System.out.println("comprobarColumnaPelicula");
        String hoja = "";
        ArrayList lista = null;
        ProgramasExcel instance = new ProgramasExcel();
        instance.comprobarColumnaPelicula(hoja, lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearColumnaPelicula method, of class ProgramasExcel.
     */
    @Test
    public void testCrearColumnaPelicula() throws Exception {
        System.out.println("crearColumnaPelicula");
        String hoja = "";
        ArrayList lista = null;
        ProgramasExcel instance = new ProgramasExcel();
        instance.crearColumnaPelicula(hoja, lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirPelicula method, of class ProgramasExcel.
     */
    @Test
    public void testAnadirPelicula() throws Exception {
        System.out.println("anadirPelicula");
        String hoja = "";
        ArrayList lista = null;
        ProgramasExcel instance = new ProgramasExcel();
        instance.anadirPelicula(hoja, lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PerteneceNombreAHoja method, of class ProgramasExcel.
     */
    @Test
    public void testPerteneceNombreAHoja() throws Exception {
        System.out.println("PerteneceNombreAHoja");
        String hoja = "";
        String nombre = "";
        ProgramasExcel instance = new ProgramasExcel();
        boolean expResult = false;
        boolean result = instance.PerteneceNombreAHoja(hoja, nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esColumnaVacia method, of class ProgramasExcel.
     */
    @Test
    public void testEsColumnaVacia() {
        System.out.println("esColumnaVacia");
        String hoja = "";
        ProgramasExcel instance = new ProgramasExcel();
        boolean expResult = false;
        boolean result = instance.esColumnaVacia(hoja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarColumna method, of class ProgramasExcel.
     */
    @Test
    public void testComprobarColumna() throws Exception {
        System.out.println("comprobarColumna");
        String hoja = "";
        String Nombre = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.comprobarColumna(hoja, Nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverNombres method, of class ProgramasExcel.
     */
    @Test
    public void testDevolverNombres() throws Exception {
        System.out.println("devolverNombres");
        String hoja = "";
        ProgramasExcel instance = new ProgramasExcel();
        String[] expResult = null;
        String[] result = instance.devolverNombres(hoja);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearExcel method, of class ProgramasExcel.
     */
    @Test
    public void testCrearExcel() throws Exception {
        System.out.println("crearExcel");
        ProgramasExcel instance = new ProgramasExcel();
        instance.crearExcel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirHoja method, of class ProgramasExcel.
     */
    @Test
    public void testAnadirHoja() throws Exception {
        System.out.println("anadirHoja");
        String lista = "";
        ProgramasExcel instance = new ProgramasExcel();
        instance.anadirHoja(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
