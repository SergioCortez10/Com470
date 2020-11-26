/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FATEC TECHNOLOGY
 */
public class Lab1Test {
    
    @Test
	public void mainTestInput1() {
		String input="1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Lab1.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 1.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 6.283185307179586"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 3.141592653589793."+ System.getProperty("line.separator");
		
		assertEquals(consoleOutput,out.toString());
	}
     @Test
	public void mainTestInput2() {
		String input="5\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Lab1.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Circulo con radio 5.0,"+ System.getProperty("line.separator");
		consoleOutput += " la circunferencia es 31.41592653589793"+ System.getProperty("line.separator");
		consoleOutput += " y el area es 78.53981633974483."+ System.getProperty("line.separator");
		
		assertEquals(consoleOutput,out.toString());
	}
        @Test
	public void mainTestInput3() {
		String input="-1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Lab1.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "Dato negativo "+ System.getProperty("line.separator");
		
		
		assertEquals(consoleOutput,out.toString());
	}
         @Test
	public void mainTestInput4() {
		String input="-abc\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args= {};
		Lab1.main(args);
		//(expected) output
		String consoleOutput="Introduzca el radio: "+ System.getProperty("line.separator");
		consoleOutput += "error de dato,"+ System.getProperty("line.separator");
		assertEquals(consoleOutput,out.toString());
	}
    
}
