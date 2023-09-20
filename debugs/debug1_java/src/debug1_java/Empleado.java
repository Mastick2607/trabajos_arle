package debug1_java;

public class Empleado {
	
	String nombre;
	String apellidoUno;
	String apellidoDos;
	int edad;
	
	
	public Empleado(String apellidoUno,String apellidoDos) {
		    this.apellidoUno =apellidoUno;
		    this.apellidoDos =apellidoDos;
		     
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoUno() {
		return apellidoUno;
	}


	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}


	public String getApellidoDos() {
		return apellidoDos;
	}


	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


}
