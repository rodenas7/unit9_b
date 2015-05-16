/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unit9_b.Alumno;
/**
 *
 * @author Alvaro
 */
public class test2 {
     private Alumno c = new Alumno();
    public test2() {
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
    public void pruebaCalculaTasaMatricula1() {    //prueba camino a-b-c-h
        int edad = 21;                               //datos entrada
        boolean familiaNumerosa=false;
        boolean repetidor =true ;
        float b1 = c.calculaTasaMatricula(edad, familiaNumerosa,repetidor);  //resultado real
        float b2 = 2000.00f;                                                    //resultado esperado
        Assert.assertEquals(b1, b2, 0.0f);
    }
    @Test
    public void pruebaCalculaTasaMatricula2() {    //prueba camino a-b-d-e-f-g-h
        int edad = 55;                               //datos entrada
        boolean familiaNumerosa=true;
        boolean repetidor =false ;
        float b1 = c.calculaTasaMatricula(edad, familiaNumerosa,repetidor);  //resultado real
        float b2 = 150.00f;                                                    //resultado esperado
        Assert.assertEquals(b1, b2, 0.0f);
    }
    @Test
    public void pruebaCalculaTasaMatricula3() {    //prueba camino a-b-d-e-f-h
        int edad = 69;                               //datos entrada
        boolean familiaNumerosa=false;
        boolean repetidor =true ;
        float b1 = c.calculaTasaMatricula(edad, familiaNumerosa,repetidor);  //resultado real
        float b2 = 250.00f;                                                    //resultado esperado
        Assert.assertEquals(b1, b2, 0.0f);
    }
    @Test
    public void pruebaCalculaTasaMatricula4() {    //prueba camino a-b-d-f-g-h
        int edad = 55;                               //datos entrada
        boolean familiaNumerosa=false;
        boolean repetidor =false ;
        float b1 = c.calculaTasaMatricula(edad, familiaNumerosa,repetidor);  //resultado real
        float b2 = 400.00f;                                                    //resultado esperado
        Assert.assertEquals(b1, b2, 0.0f);
    }
    @Test
    public void pruebaCalculaTasaMatricula5() {    //prueba camino a-b-d-f-h
        int edad = 30;                               //datos entrada
        boolean familiaNumerosa=false;
        boolean repetidor =false ;
        float b1 = c.calculaTasaMatricula(edad, familiaNumerosa,repetidor);  //resultado real
        float b2 = 500.00f;                                                    //resultado esperado
        Assert.assertEquals(b1, b2, 0.0f);
    }
}
