/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author FATEC TECHNOLOGY
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            double r, area, circunferecnia;
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca el radio: ");
            r = leer.nextDouble();
            if (r > 0) {
                circunferecnia = 2 * Math.PI * r;
                area = Math.PI * Math.pow(r, 2);
                System.out.println("Circulo con radio " + r + ",");
                System.out.println(" la circunferencia es " + circunferecnia);
                System.out.println(" y el area es " + area + ".");
                leer.close();
            } else if (r < 0) {
                System.out.println("No es hay radio menor negativo");
            }
        } catch (Exception e) {
            System.out.print("No se introducio un valor numerico");
            System.out.println();
        }

    }

}
