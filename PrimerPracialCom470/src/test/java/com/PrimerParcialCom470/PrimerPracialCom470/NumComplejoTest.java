/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PrimerParcialCom470.PrimerPracialCom470;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Usuario
 */
@RunWith(Parameterized.class)
public class NumComplejoTest {
    
    
    @Parameterized.Parameters
    public static List<Object> datos(){
        return Arrays.asList(new Object[][]{{1,5},{4,5},{4,5},{5,6},{4,5},{4,7},{5,4},{5,7},{3,4},{3,4}});
        }
    
    public NumComplejoTest(int valor1, int valor2) {
        this.parteReal = valor1;
        this.parteImaginaria = valor2;
    }
    private int parteReal;
    private int parteImaginaria;
  
    
    @Test
	public void testSumar() {
		NumComplejo instancia = new NumComplejo(1, 1);
		
		NumComplejo resultado = instancia.sumar(new NumComplejo(parteReal, parteImaginaria));
		NumComplejo esperado = new NumComplejo(parteReal + 1, parteImaginaria + 1);
		
		assertEquals(resultado.getParteReal(), esperado.getParteReal());
		assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
	}
    

    @Test
	public void testRestar() {
		NumComplejo instancia = new NumComplejo(1, 1);
		
		NumComplejo resultado = instancia.restar(new NumComplejo(parteReal, parteImaginaria));
		NumComplejo esperado = new NumComplejo(1 - parteReal, 1 - parteImaginaria);
		
		assertEquals(resultado.getParteReal(), esperado.getParteReal());
		assertEquals(resultado.getParteImaginaria(), esperado.getParteImaginaria());
	}
    
    
}
