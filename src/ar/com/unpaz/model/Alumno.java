package ar.com.unpaz.model;

public class Alumno {// Los atributos tienen que ser todos privados
	
	private String nombre;
	private int edad;
	private int legajo;
	
	public Alumno(String nombre,int edad, int legajo) {
		
		
		setNombre(nombre);setEdad(edad);setLegajo(legajo);
		
		this.edad = edad;
		this.legajo = legajo;
		
	}
	
	private String setNombre(String nombre){
		if (nombre == "") {return null;}
	private setEdad() {if (edad)}
}
