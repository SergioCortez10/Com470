/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class NumeroPrimoTest {
    
    NumeroPrimo utils = new NumeroPrimo();
    
    @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{{2,true},{8,false}});
        }
    
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public boolean resultado;
    
    @Test
    public void testValidate() {
        assertEquals(resultado, utils.validate(valor1));
    }
    
}
