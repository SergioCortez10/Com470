 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhonny
 */
public class CalculateSimpleTest {
     CalculateSimple calcu = new CalculateSimple();
     
   

    @Test
    public void testAdd() {
       
        OperationModel operationModel = new OperationModel(5,8);
       
        int esperado = 13;
        int resultado = calcu.add(operationModel);
        assertEquals(esperado, resultado);
        
    }

    @Test
    public void testSubtract() {
           OperationModel operationModel = new OperationModel(4,2);
       
        int esperado = 2;
        int resultado = calcu.subtract(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testMultiply() {
     OperationModel operationModel = new OperationModel(3,7);
       
        int esperado = 21;
        int resultado = calcu.multiply(operationModel);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDivide() {
        OperationModel operationModel = new OperationModel(18,9);
       
        double esperado = 2.0;
        double resultado = calcu.divide(operationModel);
        assertEquals(esperado, resultado, 0.0);
       
    }

    @Test
    public void testFactorial() {
       OperationModel operationModel = new OperationModel(8);
       
        int esperado = 40320;
        int resultado = calcu.factorial(operationModel);
        assertEquals(esperado, resultado);
       
    }

    @Test
    public void testFibonacci() {
       OperationModel operationModel = new OperationModel(10);
        
        int esperado = 55;
        int resultado = calcu.fibonacci(operationModel);
        assertEquals(esperado, resultado);
        
    }

    @Test
    public void testSqrt() {
       OperationModel operationModel = new OperationModel(36);
        double esperado = 6.0;
        double resultado = calcu.sqrt(operationModel);
        assertEquals(esperado, resultado, 0.0);
        
    }

    @Test
    public void testPower() {
        OperationModel operationModel = new OperationModel(22);
        
        int esperado = 484;
        int resultado = calcu.power(operationModel);
        assertEquals(esperado, resultado);
        
    }

    @Test
    public void testClearSimple() {
      
        OperationModel operationModel = new OperationModel(0,0);
         int esperado = 0;
        OperationModel resultado = calcu.clearSimple(operationModel);
        assertEquals(esperado, resultado);
       
    }

    
    
}