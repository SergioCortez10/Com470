/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

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
public class PalindromoTest {
    Palindromo utils = new Palindromo ();
    
     @Parameterized.Parameters
    public static List<Object> datos(){
        return org.assertj.core.util.Arrays.asList(new Object[][]{{"somos", true},{"arana",false}});
    }
    @Parameterized.Parameter(0)
    public String valor1;
    @Parameterized.Parameter(1)
    public boolean resultado;
    

    @Test
    public void testBuscaPalindromo() {
        assertEquals(resultado, utils.buscaPalindromo(valor1));
        
    }
    
}
