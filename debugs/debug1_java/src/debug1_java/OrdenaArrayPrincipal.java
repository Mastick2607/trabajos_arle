package debug1_java;

import java.util.ArrayList;
import java.util.Iterator;

public class OrdenaArrayPrincipal {
	
	
	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("cortes", "navarro");
		Empleado e2 = new Empleado("valverde", "motenegro");
		Empleado e3 = new Empleado("Aguire", "Montoya");
        Empleado e4 = new Empleado("valverde", "pancho");
        
        ArrayList<Empleado> arrayListEmpleado = new ArrayList<Empleado>();
        
        arrayListEmpleado.add(e1);
        arrayListEmpleado.add(e2);
        arrayListEmpleado.add(e3);
        arrayListEmpleado.add(e4);
        
        mostrar(arrayListEmpleado);
        
        

	}

	private static void mostrar(ArrayList<Empleado> arrayEmpleado) {
            Iterator<Empleado> iteratorEmpleado = arrayEmpleado.iterator();
            System.out.println("----------Empleado---------------");
           while(iteratorEmpleado.hasNext()) {
        	   
        	      Empleado empleadoActual = iteratorEmpleado.next();
   
                  System.out.println(empleadoActual.getApellidoUno()+", "+empleadoActual.getApellidoDos());

           }
	}

	
}
