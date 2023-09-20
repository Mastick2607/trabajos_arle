package ejercicio_cancha;

import javax.swing.JOptionPane;

public class Cancha {
	
public static void main(String[] arg) {
		
		String cadena;
		double ladoA;
		double ladoB;
		double area;
		
		cadena= JOptionPane.showInputDialog("Ingrse la longitud del lado A");
		ladoA= Double.parseDouble(cadena);
		
		cadena= JOptionPane.showInputDialog("Ingrse la longitud del lado B");
		ladoB= Double.parseDouble(cadena);
		
		area = ladoA +ladoB;
		
	JOptionPane.showMessageDialog(null, "El area de la gramilla es de "+area+ " con esto ya se determina el costo de la misma");
	
	}


}
