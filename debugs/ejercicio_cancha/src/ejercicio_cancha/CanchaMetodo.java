package ejercicio_cancha;
import javax.swing.JOptionPane;


public class CanchaMetodo {
	
	public static void main(String[] arg) {
		
		double ladoA;
		double ladoB;
		

		ladoA= ingresarDatos("Ingrese la longitud del lado A");
		ladoB= ingresarDatos("Ingrese la longitud del lado B");
		calculaArea(ladoA, ladoB);

	}
	
	public static double ingresarDatos(String mensaje) {
		
		   double valor;
		   
		   valor=Double.parseDouble(JOptionPane.showInternalInputDialog(null, mensaje));
		    return valor;
	}
	
	public static void calculaArea(double x, double y){
		double resultado;
		
		resultado = x * y;
		
		JOptionPane.showInputDialog(null, "El resultado es"+ resultado);
		
	
}
	
}
