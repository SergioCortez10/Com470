/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.mockito1app.service;

import com.com470.mockito1app.controller.ICuenta;
import com.com470.mockito1app.controller.IRepositorioCuentas;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Usuario
 */
public class GestorLoginTest {
    
    @Mock
    ICuenta cuenta;
    IRepositorioCuentas repo;
        
    @Test
    public void testAcceder() {

    }
  
    
    @Test
    public void testUsuarioIncorrecto() {
    }
    @Test
    public void testAccesoConcedidoALaPrimera() {
        when(cuenta.claveCorrecta("1234")).thenReturn(true);
    }
    @Test
    public void testAccesoDenegadodoALaPrimera() {
    }
    @Test
    public void testAccesoDenegadoCuentaBloqueada() {
    }

    
}
