/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Usuario
 */

@RunWith(Parameterized.class)
public class CalculadoraTest {
    
    Calculadora utils = new Calculadora(); 
    
    
    @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{{2,2},{4,3}});
        }
    
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    
    @Test
    public void testSuma() {
        int esperado = valor1+valor2;
        assertEquals(esperado,utils.suma(valor1, valor2));
    }
    @Test
    public void testResta() {
        int esperado = valor1-valor2;
        assertEquals(esperado,utils.resta(valor1, valor2));
    }
    @Test
    public void testMultimplicacion() {
        int esperado = valor1*valor2;
        assertEquals(esperado,utils.multimplicacion(valor1, valor2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivision(){
        int esperado = valor1/valor2;
        int result = utils.division(valor1, valor2);
        assertEquals(esperado, result);
    }   
}
