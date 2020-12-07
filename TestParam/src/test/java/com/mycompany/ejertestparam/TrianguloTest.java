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
public class TrianguloTest {
     
    @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{{2,2,2},{2,2,3},{2,3,4}});
        } 
@Parameterized.Parameter(0)
public int valor1;
@Parameterized.Parameter(1)
public int valor2;
@Parameterized.Parameter(2)
public int valor3;

Triangulo utils = new Triangulo();

    @Test
    public void testSomeMethod() {
       String esperado1 = "Equilatero";
       String esperado2 = "Isoceles";
       String esperado3 = "Escaleno";
       
        System.out.println("Los parametros son: 11="+valor1+" 12="+valor2+" 13="+valor3);
        String resultado = utils.tipoTriangulo(valor1, valor2, valor3);
        if(valor1 == valor2 && valor2 == valor3){
            //resultado Equilatero  
            assertEquals(esperado1,resultado);
        }else if(valor1 == valor2 || valor1 == valor3 || valor2==valor3){
            //resultado Isoceles 
            assertEquals(esperado2,resultado);
        }else if(valor1 != valor2 || valor1 != valor3 || valor2 != valor3){
            //resultado escaleno
            assertEquals(esperado3,resultado);
        }
    }   
}
