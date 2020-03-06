/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vladimir
 */
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
     * Test of getCodigo method, of class Empleado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Empleado.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Empleado instance = new Empleado();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea_laboral method, of class Empleado.
     */
    @Test
    public void testGetArea_laboral() {
        System.out.println("getArea_laboral");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getArea_laboral();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea_laboral method, of class Empleado.
     */
    @Test
    public void testSetArea_laboral() {
        System.out.println("setArea_laboral");
        String area_laboral = "";
        Empleado instance = new Empleado();
        instance.setArea_laboral(area_laboral);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Empleado.
     */
    @Test
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.getSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Empleado.
     */
    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Empleado instance = new Empleado();
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getH_extras method, of class Empleado.
     */
    @Test
    public void testGetH_extras() {
        System.out.println("getH_extras");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getH_extras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setH_extras method, of class Empleado.
     */
    @Test
    public void testSetH_extras() {
        System.out.println("setH_extras");
        int h_extras = 0;
        Empleado instance = new Empleado();
        instance.setH_extras(h_extras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAfil_Seguro method, of class Empleado.
     */
    @Test
    public void testGetAfil_Seguro() {
        System.out.println("getAfil_Seguro");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getAfil_Seguro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAfil_Seguro method, of class Empleado.
     */
    @Test
    public void testSetAfil_Seguro() {
        System.out.println("setAfil_Seguro");
        String afil_Seguro = "";
        Empleado instance = new Empleado();
        instance.setAfil_Seguro(afil_Seguro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MontoHExtras method, of class Empleado.
     */
    @Test
    public void testMontoHExtras() {
        System.out.println("MontoHExtras");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.MontoHExtras();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MontoSeguro method, of class Empleado.
     */
    @Test
    public void testMontoSeguro() {
        System.out.println("MontoSeguro");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.MontoSeguro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MontoEsSalud method, of class Empleado.
     */
    @Test
    public void testMontoEsSalud() {
        System.out.println("MontoEsSalud");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.MontoEsSalud();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Descuento method, of class Empleado.
     */
    @Test
    public void testDescuento() {
        System.out.println("Descuento");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.Descuento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SueldoBruto method, of class Empleado.
     */
    @Test
    public void testSueldoBruto() {
        System.out.println("SueldoBruto");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.SueldoBruto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SueldoNeto method, of class Empleado.
     */
    @Test
    public void testSueldoNeto() {
        System.out.println("SueldoNeto");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.SueldoNeto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
