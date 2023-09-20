package ejercicio_cancha;

import javax.swing.JOptionPane;

public class Notas {

	
	public static void main(String[] arg) {
		
		
		int n= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de notas"));
		double suma =0 ; 
		double promedio=0;
		for(int i=0; i<n; i++) {
			
			Double nota= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota "+ (i+1))); 
	       System .out.println(nota);
	     
	     	
	     	suma += nota;
	     	
	     
		}
		
		promedio = (suma)/n;
		
		JOptionPane.showMessageDialog(null, "El promedio de todas las notas del estudiante es de "+ promedio);
	      
		

		
	
	}
}
