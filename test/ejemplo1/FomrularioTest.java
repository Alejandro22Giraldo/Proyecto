/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312A-13
 */
public class FomrularioTest {
    
    public FomrularioTest() {
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
     * Test of main method, of class Fomrulario.
     */
    @Test
    public void testCalcular_Hipotenusa() {
        System.out.println("Calcular Hipotenusa");
        double ladoa = 3;
        double ladob = 4;
        double expResult = 5;
        double result = Pitagoras.Calcular_Hipotenusa(ladoa, ladob);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
}
