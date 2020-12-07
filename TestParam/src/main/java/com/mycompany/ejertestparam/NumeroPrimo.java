/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

/**
 *
 * @author Juan Carlos
 */
public class NumeroPrimo {

    public NumeroPrimo() {
    }
    
       
    public Boolean validate(int numeroPrimo){
        for(int i=2;i<(numeroPrimo/2);i++){
            if(numeroPrimo % i ==0){
                return false;
            }
        }
        return true;
    }
    
}
