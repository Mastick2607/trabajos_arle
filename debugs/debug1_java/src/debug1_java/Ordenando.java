package debug1_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenando implements Comparator<Empleado>  {
	
	public static void ordenarArrayListPorApellido(ArrayList<Empleado> arrayEmpleados ) {
		
		Collections.sort(arrayEmpleados,new Comparator<Empleado>() {
			
			@Override
			public int compare(Empleado e1, Empleado e2) {

				return new String(e1.getApellidoUno().concat(e1.getApellidoDos()))
					.compareTo(new String(e2.getApellidoUno().concat(e2.getApellidoDos())));
			}
		}); 
	
	}

	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
