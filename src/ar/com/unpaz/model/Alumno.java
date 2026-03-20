package ar.com.unpaz.model;


public class Alumno {// Los atributos tienen que ser todos privados
	
	private String nombre;
	private int edad;
	private int legajo;
	
	public Alumno(String nombre,int edad, int legajo) {
		
		
//		
//		if((setNombre(nombre) == null) || (setLegajo(legajo) == 0) || (setEdad(edad) == 0)) {
//			System.out.println("requisitos ingresados incorrectamnete");} 
//		
//		
//		else{
			this.edad = edad;
			this.legajo = legajo;
			this.nombre = nombre;
		
	}
	
	public boolean verificarAcceso () {
		if((setNombre(this.getNombre()) == null) || (setLegajo(this.getLegajo()) == 0) || (this.setEdad(edad) == 0)) {
			return false;
			
		} 
		else {return true;}
		
		
	}
	
	private String setNombre(String nombre){
		if (nombre == null) {return null;}
		else {return nombre;}
	
	}
	private int setEdad(int edad) {
		
		if (edad<=0) {
			return 0;
		}
		else {return edad;}
		}
	
	private int setLegajo(int Legajo) {
		if (Legajo <0) {
			return 0;
			
		}
		else {return Legajo;}
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getLegajo() {
		return legajo;
	}
}
