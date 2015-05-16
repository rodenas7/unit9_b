/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unit9_b.Alumno;
/**
 *
 * @author Alvaro
 */
public class test1 {
     private Alumno c = new Alumno();
    public test1() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void pruebaValidaNif1() {    //prueba camino a-b
        String dni = "4517046N";        //datos entrada
        boolean b1 = c.validaNif(dni);  //resultado real
        boolean b2 = false;             //resultado esperado
        assertEquals(b1,b2);
    }
    @Test
    public void pruebaValidaNif2() {    //prueba camino a-c-d-f	
        String dni = "74517045N";        //datos entrada
        boolean b1 = c.validaNif(dni);  //resultado real
        boolean b2 = true;             //resultado esperado
        assertEquals(b1,b2);
    }
    @Test
    public void pruebaValidaNif3() {    //prueba camino a-c-e
        String dni = "7451Y045N";        //datos entrada
        boolean b1 = c.validaNif(dni);  //resultado real
        boolean b2 = false;             //resultado esperado
        assertEquals(b1,b2);
    }
    
}
