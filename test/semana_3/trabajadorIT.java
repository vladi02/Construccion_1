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
public class trabajadorIT {
    
    public trabajadorIT() {
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
     * Test of agregar method, of class trabajador.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Empleado e = null;
        trabajador instance = new trabajador();
        instance.agregar(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class trabajador.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        int pos = 0;
        Empleado e = null;
        trabajador instance = new trabajador();
        instance.modificar(pos, e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MayorSueldo method, of class trabajador.
     */
    @Test
    public void testMayorSueldo() {
        System.out.println("MayorSueldo");
        trabajador instance = new trabajador();
        String expResult = "";
        String result = instance.MayorSueldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PromedioNeto method, of class trabajador.
     */
    @Test
    public void testPromedioNeto() {
        System.out.println("PromedioNeto");
        trabajador instance = new trabajador();
        double expResult = 0.0;
        double result = instance.PromedioNeto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Num_Empleados method, of class trabajador.
     */
    @Test
    public void testNum_Empleados() {
        System.out.println("Num_Empleados");
        trabajador instance = new trabajador();
        int expResult = 0;
        int result = instance.Num_Empleados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Num_Horas method, of class trabajador.
     */
    @Test
    public void testNum_Horas() {
        System.out.println("Num_Horas");
        trabajador instance = new trabajador();
        int expResult = 0;
        int result = instance.Num_Horas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Menor_SNP method, of class trabajador.
     */
    @Test
    public void testMenor_SNP() {
        System.out.println("Menor_SNP");
        trabajador instance = new trabajador();
        String expResult = "";
        String result = instance.Menor_SNP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Gasto_total method, of class trabajador.
     */
    @Test
    public void testGasto_total() {
        System.out.println("Gasto_total");
        trabajador instance = new trabajador();
        double expResult = 0.0;
        double result = instance.Gasto_total();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class trabajador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        trabajador instance = new trabajador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
